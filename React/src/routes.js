import React from 'react';
import Login from './pages/login/Login';


import { BrowserRouter, Switch, Route } from 'react-router-dom';

const Routes = () => (
    <BrowserRouter>
        <Switch>
            <Route exact path="/" component={Login} />
        </Switch>
    </BrowserRouter>
);

export default Routes;