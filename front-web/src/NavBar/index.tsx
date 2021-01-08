import './styles.css';
import { ReactComponent as Logo } from './logo.svg';
function NavBar(){
    return(
        <nav className="main-navbar">
            <Logo/>
            <a href="local" className="navbar-text">FD Delivery</a>
        </nav>
    )
}

export default NavBar;