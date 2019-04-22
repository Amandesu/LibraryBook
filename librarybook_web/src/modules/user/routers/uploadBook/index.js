
import React from "react";
import { bindActionCreators } from "redux";
import { connect } from "react-redux";
import { Helmet } from "react-helmet";

import {
    Form, Icon, Input, Button, Checkbox, DatePicker, Select
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
        cid:"",
        categories:[]

    }
    componentDidMount() {
        callApi({
            url:"/book/getCategories",
            type:"GET"
        }).then(res => {
            let categories = res.body || [];
            console.log(categories[0].categoryId)
            this.setState({categories, cid:categories[0].categoryId})
        })
    }
    handleSubmit = (e) => {
        e.preventDefault();
        this.props.form.validateFields((err, values) => {
            const forms = this.props.form.getFieldsValue();
        });
    }
    handleChange = cid => {
        this.setState({
            cid
        })
    }
    render() {
        const { state, props } = this;
        const getFieldDecorator = props.form.getFieldDecorator;

        const formItemLayout = { labelCol: { xs: { span: 24 }, sm: { span: 6 } }, wrapperCol: { xs: { span: 24 }, sm: { span: 18 }}};
        return (
            <div className={prefix}>
                <Form onSubmit={this.handleSubmit} className="register-form" {...formItemLayout} layout='horizontal'>
                    <Form.Item
                        label="书籍分类"
                    >
                        {getFieldDecorator('cid', {
                            rules: [{
                                required: true, message: '请输入书籍名称',
                            }]
                        })(
                            <div>
                            
                            
                                <Select style={{ width: 300 }} onChange={this.handleChange} value={state.cid}>
                                    {state.categories.map(cat => {
                                        return (
                                            <Option value={cat.categoryId} key={cat.categoryId}>{cat.categoryName}</Option>
                                        )
                                    })}
                                </Select>
                            </div>
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