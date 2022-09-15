import { Link } from "react-router-dom";
import { selectTrainer, setDefault } from "../../components/Login/TrainerSlice";
import { useAppDispatch, useAppSelector } from "../Redux/hooks";
import "./NavBar.css";

function NavBar() {
    const trainer = useAppSelector(selectTrainer);
    const dispatch = useAppDispatch();

    function logout() {
        dispatch(setDefault());
    }

    return <div className="flex">
        <Link to="/">Home</Link>
        <Link to="/PokeList">Pokemon List</Link>

        {
            !trainer.id ? <Link to="/Login">Login</Link> : <Link to="/" onClick={logout}>Logout</Link>
        }

        {
            // We are utilizing truthy and falsey of JS to render this welcome properly
            // Because what is the boolean expression of an empty string?
            trainer.name && <p>Welcome back {trainer.name}!</p>
        }
    </div>
}

export default NavBar;