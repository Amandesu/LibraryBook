import React from "react";
import ReactDOM from "react-dom";
import { Provider } from "react-redux";
import { createStore, applyMiddleware, compose } from "redux";
import rootRouter from "./main/routers";
import rootReduces from "./main/reduces";
import { Header } from "component";
import { WxAuth, TmCache , locationSearch, callApi } from "Utils";
import "./index.less";
const store = createStore(rootReduces, {})
class App extends React.Component {
    render(){
        return (
            <Provider store={store}>
                <Header />
                {rootRouter}
            </Provider>
        )
    }
}

ReactDOM.render(
    <App />
, document.getElementById("root"))  


