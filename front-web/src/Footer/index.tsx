import { ReactComponent as Instagram} from './instagram.svg'
import { ReactComponent as Youtube} from './youtube.svg'
import { ReactComponent as Linkedin} from './linkedin.svg'
import './styles.css'
function Footer(){

    return(
        <div className="footer-main">
            <p>App Desenvolvido durante a 2ª ed. do evento <b> Semana DevSuperior</b></p>
            <div className="footer-icons">
                <a href="http://www.google.com" target="_new"> <Youtube/> </a>
                <a href="http://www.google.com" target="_new"> <Linkedin/> </a>
                <a href="http://www.google.com" target="_new"> <Instagram/></a>
            </div>
        </div>
    )
}

export default Footer;