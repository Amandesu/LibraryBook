
import { handleActions } from 'redux-actions';
// 回收详情
export const Home_Index = handleActions(
    {
        ["HOME_INDEX_CHANGE"]: (state, payload) => {
            return { ...state, ...action.payload };
        }
    },
    {
        loginMsg: {}
    }
)