import{ BrowserRouter, Switch, Route} from 'react-router-dom'
import Home from './Home'
import NavBar from './NavBar'
import Orders from './orders'

function Routes(){
    return(
        <BrowserRouter>
            <NavBar/>
            <Switch>
                <Route path="/orders" >
                    <Orders/>
                </Route>
                <Route path="/">
                    <Home/>
                </Route>
            </Switch>
        </BrowserRouter>
    )
}
export default Routes;