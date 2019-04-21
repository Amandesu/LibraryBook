
import { handleActions } from 'redux-actions';
// 用户注册
export const User_Register = handleActions(
    {
        ["USER_REGISTER_CHANGE"]: (state, payload) => {
            return { ...state, ...action.payload };
        }
    },
    {
        loginMsg: {}
    }
)

export const Upload_Book = handleActions(
    {
        ["UPLOAD_BOOK_CHANGE"]: (state, payload) => {
            return { ...state, ...action.payload };
        }
    },
    {
        loginMsg: {}
    }
)