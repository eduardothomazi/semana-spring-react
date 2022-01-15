import { ReactComponent as GitHunIcon } from 'assets/img/github.svg'
import './styles.css'

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1 className='dsmovie-title'>DSMovie</h1>
                    <a href="https://github.com/eduardothomazi" >
                        <div className='dsmovie-contact-container'>
                            <GitHunIcon />
                            <p className='dsmovie-contact-link'>/eduardothomazi</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );

}

export default Navbar;