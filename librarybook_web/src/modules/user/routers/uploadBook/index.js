
import React from "react";
import { bindActionCreators } from "redux";
import { connect } from "react-redux";
import { Helmet } from "react-helmet";

import {
    Form, Icon, Input, Button, Checkbox, DatePicker
} from 'antd';
import { callApi } from "Utils"
import "./index.less";


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
    componentDidMount() {
        callApi({
            url:"/book/getCategories",
            type:"GET"
        }).then(res => {
            console.log(res)
        })
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
        return (
            <div className={prefix}>
                <Form onSubmit={this.handleSubmit} className="register-form" {...formItemLayout} layout='horizontal'>
                    <Form.Item
                        label="书籍名称"
                    >
                        {getFieldDecorator('name', {
                            rules: [{
                                required: true, message: '请输入书籍名称',
                            }]
                        })(
                            <Input type="text" />
                        )}
                    </Form.Item>
                    <Form.Item
                        label="书籍种类"
                    >
                        {getFieldDecorator('name', {
                            rules: [{
                                required: true, message: '请输入书籍名称',
                            }]
                        })(
                            <Input type="text" />
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