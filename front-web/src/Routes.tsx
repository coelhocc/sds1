import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom'; //npm install react-router-dom --dev
                                                                 //npm install @types/react-router-dom --dev
import Header from './componets/Header';
import Home from './pages/Home';
import Records from './pages/Records';

const Routes = () => (
    <BrowserRouter>
        <Header />
        <Switch>
            <Route path="/" exact>
                <Home />
            </Route>
            <Route path="/records">
                <Records />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;