
import React from "react";
import { bindActionCreators } from "redux";
import { connect } from "react-redux";
import { Helmet } from "react-helmet";

import {
    Form, Icon, Input, Button, Checkbox, DatePicker
} from 'antd';
import { callApi } from "Utils"
import "./index.less";


const prefix = "user-register";
@connect(
    (state) => ({
        User: state.User_Register
    }),
    (dispatch) => bindActionCreators({
        changeData: (payload) => ({ type: "USER_REGISTER_CHANGE", payload }),
    }, dispatch)
)
class Register extends React.Component {
    UNSAFE_componentWillReceiveProps(nextProps) {

    }
    componentDidMount() {
       
    }
    handleSubmit = (e) => {
        e.preventDefault();
        this.props.form.validateFields((err, values) => {
            const forms = this.props.form.getFieldsValue();
            if (!err) {
                callApi({
                    url:"/user/register",
                    type:"POST",
                    data:{
                        userName: forms.userName,
                        password: forms.password
                    }
                }).then(res => {

                })
            }
        });
    }
    render() {
        const { state, props } = this;
        const getFieldDecorator = props.form.getFieldDecorator;
        return (
            <div className={prefix}>
                <Helmet>
                    <title>注册</title>
                </Helmet>
                <Form onSubmit={this.handleSubmit} className="register-form">
                    <Form.Item>
                        {
                            getFieldDecorator('userName', {
                            rules: [
                                { required: true, message: '请输入用户名' },
                                {validator: (rule, value, callback) => {
                                    if (value && !/.{8,}/.test(value)) {
                                        callback("用户名的长度不能小于8");
                                    }
                                    callback();

                                }}
                            ],
                        })(
                            <Input prefix={<Icon type="user" style={{ color: 'rgba(0,0,0,.25)' }} />} placeholder="用户名" />
                        )}
                    </Form.Item>
                    <Form.Item>
                        {getFieldDecorator('password', {
                            rules: [
                                { required: true, message: '请输入密码' },
                                {
                                    validator: (rule, value, callback) => {
                                        if (value && !/.{8,}/.test(value)) {
                                            callback("密码的长度不能小于6");
                                        }
                                        callback();

                                    }
                                }
                            ],
                        })(
                            <Input prefix={<Icon type="lock" style={{ color: 'rgba(0,0,0,.25)' }} />} type="password" placeholder="密码" />
                        )}
                    </Form.Item>
                    <Form.Item>
                    
                        <Button type="primary" htmlType="submit" className="login-form-button">
                            注册
                        </Button>
                        <a href="">登录</a>
                    </Form.Item>
                </Form>
            </div>
        )
    }
}
export default Form.create({ name: 'register' })(Register)
