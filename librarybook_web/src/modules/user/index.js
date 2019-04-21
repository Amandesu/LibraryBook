

import React from "react";
import { Route, Switch } from "react-router-dom";
import Loadable from "react-loadable"
// 按需加载
const Register = Loadable({
    loader: () => import('./routers/register'), loading: () => <div></div>
}); 

const UploadBook = Loadable({
    loader: () => import('./routers/uploadBook'), loading: () => <div></div>
}); 

let routers = (props) => {
    return (
        <Switch>
            <Route path="/user/register" exact 
                render={(props) => {
                    return <Register />
                }}
            />
            <Route path="/user/uploadBook" exact
                render={(props) => {
                    return <UploadBook />
                }}
            />
            <Route path="/user" exact 
                render={(props) => {
                    return <Register />
                }}
            />
        </Switch>
    )
}
export {
    routers
}

