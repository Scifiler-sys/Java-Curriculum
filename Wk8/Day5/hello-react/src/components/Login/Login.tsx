import axios from "axios";
import React, { useState } from "react";
import { useSelector } from "react-redux";
import { ITrainer } from "../../models/TrainerModel";
import { useAppDispatch, useAppSelector } from "../../shared/Redux/hooks";
import "./Login.css";
import { selectTrainer, setTrainer } from "./TrainerSlice";

function Login() {
    
    const trainer = useAppSelector(selectTrainer); //We are grabbing trainer slice information from the store

    const dispatch = useAppDispatch(); //Setting our dispatch, dispath is responsible for sending actions with or without payloads
    const [trainerId, setTrainerId] = useState(0);

    function updateTrainerId(e:React.ChangeEvent<HTMLInputElement>) {

        setTrainerId(+e.target.value);
        
        // console.log(trainerId);
    }

    function onSubmit(e:React.FormEvent<HTMLFormElement>) {
        e.preventDefault();

        axios.get<ITrainer>(`http://smresteb-env.eba-u2i9uhvs.us-east-1.elasticbeanstalk.com/rest/getUserPokemon?id=${trainerId}`)
            .then(response => {

                //We are telling redux dispatch to create an action w/ a payload of our current user
                //and point it to the setTrainer reducer that will then mutate the state stored in our store
                dispatch(setTrainer(response.data));

                // console.log(trainer);
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