
import React from "react";
import { bindActionCreators } from "redux";
import { connect } from "react-redux";
import { Helmet } from "react-helmet";

import { Dropdown, Menu, Button } from 'antd';
import { callApi } from "Utils"
import "./index.less";


const prefix = "home-index";
@connect(
    (state) => ({
        User: state.Home_Index
    }),
    (dispatch) => bindActionCreators({
        changeData: (payload) => ({ type: "HOME_INDEX_CHANGE", payload }),
    }, dispatch)
)
class Index extends React.Component {
    UNSAFE_componentWillReceiveProps(nextProps) {

    }
    componentDidMount() {
       
    }
    render() {
        const { state, props } = this;
        

        return (
            <div className={prefix}>
                <Helmet>
                    <title>图书管理</title>
                </Helmet>
                首页
                {/* <div className="header">
                    <div className="left">
                        <div className="item">首页</div>
                        <div className="item">前端开发</div>
                        <div className="item">后端开发</div>
                        <div className="item">IOS开发</div>
                        <div className="item">安卓开发</div>
                    </div>
                    <div className="right">
                        <Dropdown overlay={this.getUserCenterMenu()} placement="bottomCenter" trigger={['click']}>
                            <div className="item">个人中心</div>
                        </Dropdown>
                    </div>
                </div> */}

                
            </div>
        )
    }
}
export default Index
