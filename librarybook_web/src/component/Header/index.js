
import React from "react";
import { bindActionCreators } from "redux";
import { connect } from "react-redux";
import { createHashHistory } from "history";
import { Helmet } from "react-helmet";

import { Dropdown, Menu, Button } from 'antd';
import { callApi } from "Utils"
import "./index.less";

const prefix = "component-header";
const history = createHashHistory();
@connect(
    (state) => ({
        User: state.Home_Index
    }),
    (dispatch) => bindActionCreators({
        changeData: (payload) => ({ type: "HOME_INDEX_CHANGE", payload }),
    }, dispatch)
)
class Header extends React.Component {
    UNSAFE_componentWillReceiveProps(nextProps) {

    }
    state = {
        categories:[]
    }
    componentDidMount() {
        callApi({
            url: "/book/getCategories",
            type: "GET"
        }).then(res => {
            let categories = res.body || [];
           

            this.setState({
                categories
            })
        })
    }
    getUserCenterMenu() {
        return (
            <Menu theme="dark">
                <Menu.Item>
                    <a className="userCenterItem">我的主页</a>
                </Menu.Item>
                <Menu.Item>
                    <a className="userCenterItem" onClick={() => history.push("/user/uploadBook")}>上传书籍</a>
                </Menu.Item>
                <Menu.Item>
                    <a className="userCenterItem">设置</a>
                </Menu.Item>
            </Menu>
        )
    }
    getCatMenu = list => {
        return (
            <Menu theme="dark">
                {list.map((sec) => {
                    console.log(sec)
                    return (
                        <Menu.Item>
                            <a className="userCenterItem">{sec.categoryname}</a>
                        </Menu.Item>
                    )
                })}
            </Menu>
        )
    }
    render() {
        const { state, props } = this;


        return (
            <div className={prefix}>
                <div className="header">
                    <div className="left">
                        <div className="item">首页</div>
                        { state.categories.map(cat => (
                            <Dropdown overlay={this.getCatMenu(cat.children)} placement="bottomCenter">
                                <div className="item">{cat.categoryName}</div>
                            </Dropdown>
                        ))}

                        {/* <div className="item">前端开发</div>
                        <div className="item">后端开发</div>
                        <div className="item">IOS开发</div>
                        <div className="item">安卓开发</div> */}
                    </div>
                    <div className="right">
                        <Dropdown overlay={this.getUserCenterMenu()} placement="bottomCenter" trigger={['click']}>
                            <div className="item">个人中心</div>
                        </Dropdown>
                    </div>
                </div>


            </div>
        )
    }
}
export default Header