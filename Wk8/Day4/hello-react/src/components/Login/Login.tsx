import axios from "axios";
import React, { useState } from "react";
import { ITrainer } from "../../models/TrainerModel";
import "./Login.css";

function Login() {
    const [currentUser, setCurrentUser] = useState<ITrainer>({
        tname: "",
        totalBadges: 0,
        trainid: 0,
        listOfPokemon: []
    });

    function updateTrainerId(e:any) {
        currentUser.trainid = e.target.value;

        setCurrentUser(currentUser);
        console.log(currentUser.trainid);
    }

    function onSubmit(e:React.FormEvent<HTMLFormElement>) {
        e.preventDefault();

        axios.get<ITrainer>(`http://smresteb-env.eba-u2i9uhvs.us-east-1.elasticbeanstalk.com/rest/getUserPokemon?id=${currentUser.trainid}`)
            .then(response => {
                currentUser.listOfPokemon = response.data.listOfPokemon;

                setCurrentUser(currentUser);
                console.log(currentUser);
            });
    }

    return <div>
        <h3>Login</h3>
        <form className="grid" onSubmit={onSubmit}>
            <label>Trainer Id</label>
            <input type="number" onChange={updateTrainerId}/>
            <input type="submit" value="Submit" />
        </form>
    </div>;
}

export default Login;