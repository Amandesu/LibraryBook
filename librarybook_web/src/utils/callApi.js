import request from "superagent";
import { message } from "antd";




function formData(json) {
    let param = new window.FormData();
    for (let key in json) {
        param.append(key, json[key])
    }
    return param
}

const callApi = ({ url = "", type = "POST", data = {}, ContentType = "multipart/form-data",config = {}}) => {
    type = type.toUpperCase();
    let fetchApi = () => Promise.resolve();
    if (type == "GET")  {
        fetchApi = () => request.get(url)
            .query(data)
            .set('Content-Type', "application/json");
    } else if (type == "POST") {
        if (ContentType == "multipart/form-data") {
            data = formData(data)
        }
        fetchApi = () => request.post(url).send(data)
    }


    let getAbort = (reject) => () => reject();
    let p1 = new Promise((resolve, reject) => {
        // 提前中断请求
        getAbort = getAbort(reject)
        let timeout = (time) => new Promise((resolve, reject) => {
            setTimeout(() => {
                reject({status:408});
            }, time)
        })
        Promise.race([timeout(config.timeout || 20000), fetchApi()]).then(res => {
            // 请求有返回

            
            let body = (res.body|| res.data) || {};
            if (res.status == 200 && body.code == 200) {
                resolve && resolve(body)
            } else {
                message.error(res.msg, 2)
                reject && reject(res)
            }
        }, err => {
            // 请求超时huo出错
            if (err.code == 408) {
                message.error("请求超时")
            } else {
                message.error(err.status+"请稍后再试", 2)
            }   
            reject && reject(err)
        })
                
    })
    p1.abort = getAbort;
    return p1;
   
}



export default callApi;