
import React from "react";
import { bindActionCreators } from "redux";
import { connect } from "react-redux";
import { Helmet } from "react-helmet";

import {
    Form, Icon, Input, Button, Checkbox, DatePicker, Select, Upload, message, Row, Col
} from 'antd';
import { callApi } from "Utils"
import "./index.less";

const Option = Select.Option;
const prefix = "user-uploadBook";
@connect(
    (state) => ({
        User: state.Upload_Book
    }),
    (dispatch) => bindActionCreators({
        changeData: (payload) => ({ type: "USER_UPLOADBOOK_CHANGE", payload }),
    }, dispatch)
)
class UploadBook extends React.Component {
    UNSAFE_componentWillReceiveProps(nextProps) {

    }
    state = {
        categories:[],
        secondCats:[],
        fileList:[],
        fileImgList:[],
        downloadUrl:""
    }
    componentDidMount() {
        this.getCategories();
    }
    getCategories(){
        return callApi({
            url:"/book/getCategories",
            type:"GET"
        }).then(res => {
            let categories = res.body || [];
            this.props.form.setFieldsValue({cid:categories[0].categoryId })
            this.setState({categories}, this.getSecCatById)
        })
    }
    getSecCatById(){
        callApi({
            url:"/book/getSecCatById",
            type:"GET",
            data:{
                id: this.props.form.getFieldValue("cid")
            }
        }).then(res => {
            let secondCats = res.body || [];
            this.props.form.setFieldsValue({sid:secondCats[0].categoryid })
            this.setState({
                secondCats: secondCats
            })
        })
    }
    getFileProps(){
        return {
            name: 'file',
            action: '/upload/file',
            headers: {
              authorization: 'authorization-text',
            },
            onChange : (info) => {
           
                info.fileList = [].concat(info.fileList.pop());
                
                this.setState({ fileList:info.fileList });

                if (info.file && info.file.status === 'done') {
                    this.setState({ downloadUrl:info.file.response.url });
                    this.props.form.setFieldsValue({ name:info.file.response.name });
                }                 
            }
        };
    }
    getImageProps(){
        return {
            name: 'file',
            action: '/upload/file',
            headers: {
              authorization: 'authorization-text',
            },
            listType:"picture-card",
            onChange : (info) => {
                console.log(info)
                if (!info.fileList[0]) {
                    info.fileList  = [];
                } else {
                    info.fileList = [].concat(info.fileList.pop());
                }
                this.setState({ fileImgList:info.fileList });

                if (info.file && info.file.status === 'done') {
                    this.setState({ downloadUrl:info.file.response.url });
                    this.props.form.setFieldsValue({ name:info.file.response.name });
                }                 
            }
        };
    }
    handleChange = cid => {
        this.setState({cid}, this.getSecCatById)
    }
    handleSubmit = (e) => {
        e.preventDefault();
        this.props.form.validateFields((err, values) => {
            const forms = this.props.form.getFieldsValue();
        });
    }
    
    render() {
        const { state, props } = this;
        const getFieldDecorator = props.form.getFieldDecorator;
        const formItemLayout = { labelCol: { xs: { span: 24 }, sm: { span: 6 } }, wrapperCol: { xs: { span: 24 }, sm: { span: 18 }}};
        const form = props.form;
        return (
            <div className={prefix}>
                <Form onSubmit={this.handleSubmit} className="uploadBook-form" {...formItemLayout} layout='horizontal'>
                    <Form.Item
                        label="书籍分类"
                    >
                        {getFieldDecorator('cid', {
                            rules: [{
                                required: true, message: '请输入书籍名称',
                            }]
                        })(
                            
                            <Select style={{ width: 300 }} onChange={this.handleChange}>
                                {state.categories.map(cat => {
                                    return (
                                        <Option value={cat.categoryId} key={cat.categoryId}>{cat.categoryName}</Option>
                                    )
                                })}
                            </Select>
                            
                        )}
                    </Form.Item>
                    <Form.Item
                        label="二级分类"
                    >
                        {getFieldDecorator('sid', {
    
                            rules: [{
                                required: true, message: '请输入书籍名称',
                            }]
                        })(
                            <Select style={{ width: 300 }}>
                                {state.secondCats.map(cat => {
                                    return (
                                        <Option value={cat.categoryid} key={cat.categoryid}>{cat.categoryname}</Option>
                                    )
                                })}
                            </Select>
                        )}
                    </Form.Item>
                    <Form.Item
                        label="书籍上传"
                    >
                        
                        <Upload {...this.getFileProps()} fileList={this.state.fileList}>
                            <Button>
                                <Icon type="upload" /> 上传
                            </Button>
                        </Upload>
                        
                    </Form.Item>
                    <Form.Item
                        label="上传封面图"
                    >
                        
                        <Upload {...this.getImageProps()} fileList={this.state.fileImgList}>
                        <div>
        <Icon type="plus" />
        <div className="ant-upload-text">Upload</div>
      </div>
                        </Upload>
                        
                    </Form.Item>
                    {form.getFieldValue("name")?
                    <Form.Item
                        label="书籍名称"
                    >
                        {getFieldDecorator('name', {
                            rules: [{
                                required: true, message: '请输入书籍名称',
                            }]
                        })(
                            <Input />
                        )}
                    </Form.Item>:""}
                    <Form.Item label=" ">
                    {getFieldDecorator('sumbit', {
                        })(
                            <Button type="primary" htmlType="submit" className="upload-book-submit">
                            提交电子书
                        </Button>
                        )}
                    </Form.Item>
                </Form>
            </div>
        )
    }
}
export default Form.create({ name: 'UploadBook' })(UploadBook)
/* 
INSERT INTO category (  categoryId, categoryName, secondCatId, secondCatName )
VALUES
( 100, "前端开发", 10001, "HTML+CSS"),
( 100, "前端开发", 10002, "JavaScript"),
( 100, "前端开发", 10003, "React技术栈"),
( 100, "前端开发", 10004, "vue技术栈"),
( 100, "前端开发", 10005, "webpack"),
( 100, "前端开发", 10006, "混合开发（React-native, weex）"),
( 100, "前端开发", 10007, "nodeJs");

*/