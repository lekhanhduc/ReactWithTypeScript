export const Navar = () => {
    return (
        <nav className='navbar navbar-expand-lg navbar-dark main-color py-3'>
            <div className="container-fluid">
                <span className="navbar-brand title-header">Book Service</span>
                <button className='navbar-toggler' type='button'
                    data-bs-toggle='collapse' data-bs-target="#navbarNavDropdown"
                    aria-controls='navbarNavDropdown' aria-expanded='false'
                    aria-label='Toggle Navigation'
                >
                    <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id='navbarNavDropdown'>
                    <ul className='navbar-nav me-auto mx-auto'>
                        <li className='nav-item menu-header'>
                            <a href="/home" className='nav-link text-header'>Home</a>
                        </li>
                        <li className='nav-item menu-header'>
                            <a href="/search" className='nav-link text-header'>Books</a>
                        </li>
                        <li className='nav-item menu-header'>
                            <a href="/search" className='nav-link text-header'>About</a>
                        </li>
                        <li className='nav-item menu-header'>
                            <a href="/search" className='nav-link text-header'>Contact</a>
                        </li>
                    </ul>
                    <ul className='navbar-nav ms-auto'>
                        <li className='nav-item'>
                            <button type='button' className='btn btn-outline-light sign-in'>Sign in</button>
                        </li>

                        <li className='nav-item'>
                            <button type='button' className='btn btn-outline-light sign-up'>Sign up</button>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    );
}