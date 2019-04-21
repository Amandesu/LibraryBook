

import React from "react";
import { Route, Switch } from "react-router-dom";
import Loadable from "react-loadable"
// 按需加载
const Index = Loadable({
    loader: () => import('./routers/index'), loading: () => <div></div>
}); 

let routers = (props) => {
    return (
        <Switch>
            <Route path="/home/index" exact 
                render={(props) => {
                    return <Register />
                }}
            />
            <Route path="/home" exact 
                render={(props) => {
                    return <Index />
                }}
            />
        </Switch>
    )
}
export {
    routers
}

