import { Link } from "react-router-dom";
import "./NavBar.css";

function NavBar() {
    return <div className="flex">
        <Link to="/">Home</Link>
        <Link to="/PokeList">Pokemon List</Link>
        <Link to="/Login">Login</Link>
    </div>
}

export default NavBar;