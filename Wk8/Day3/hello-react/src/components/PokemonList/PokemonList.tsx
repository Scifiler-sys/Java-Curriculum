import axios from "axios";
import React, { useEffect, useState } from "react";
import { IPokemon } from "../../models/PokemonModel";
import PokemonBox from "../PokemonBox/PokemonBox";
import "./PokemonList.css";

function PokemonList() {
    const [newPokemon, setNewPoke] = useState<IPokemon>({
        damage:0,
        health:0,
        img:"",
        level:0,
        name:"MissingNo"
    });

    /**
     * As we talked about numerous times, having hard coded values won't get you very far
     * 
     * So let us transform our PokemonList component to grab information from our api instead using Axios
     * 
     * However, to fully utilize grabbing stuff from the network takes a new level of hook required to update our website accordingly
     * this is the useEffect() another hook introduced in React for functional components
     *  - Essentially, it will run that function whenever an "update" gets detected by React
     *  - It will also run when you first initializes your component (probably the most useful case as to why we want to use it for our api)
     *  - One of those "updates", whenever the DOM changes
     *  
     * So main idea, we will have a blank listOfPokemon that needs some extra steps to grab its data but we want this data to be displayed accordingly
     * Grabbing information from the network takes time, we want to use useEffect() to change our page the moment it gets a response, 
     * go ahead and update my website with the change
     * 
     * TLDR: If the creation logic to grab data and setting it as a default value for a state is complex, use useEffect()
     *
     */

    const [listOfPoke, setListOfPoke] = useState<IPokemon[]>([]);

    useEffect(() => {

        //get() method uses HTTP GET Verb
        axios.get<IPokemon[]>("http://smresteb-env.eba-u2i9uhvs.us-east-1.elasticbeanstalk.com/rest/allpokemon")
            .then(response => {

                //We are grabbing information from our own API!!
                //Unfortunately, you need some extra configuration from your backend team to allow frontend team to have access to your resource
                console.log(response);
                setListOfPoke(response.data);
            });

    }, []); //Empty array is for values that useEffect should look for if in the event that value changes, go ahead and re-run this function

    return <div>
        <h3>Add Pokemon</h3>
        <form className="grid" onSubmit={onSubmit}>
            <label>Name</label>
            <input name="pname" type="text" onChange={updateName}/>
            <label>Level</label>
            <input name="lvl" type="number" onChange={updateLevel}/>
            <label>Health</label>
            <input name="hlth" type="number" onChange={updateHealth}/>
            <label>Damage</label>
            <input name="dmg" type="number" onChange={updateDamage}/>
            <label>Image</label>
            <input name="img" type="text" onChange={updateImg}/>
            <input type="submit" value="Add Pokemon"/>
        </form>

        <h3>Pokemon List</h3>
        <div className="grid-poke-list">
            {
                listOfPoke?.map(poke => {
                    return <PokemonBox key={poke.id} {...poke}/>
                })
            }
        </div>
    </div>

    /*
        React forms is not needed to show in curriculum but I think really important anyway

        Steps to make a form properly
        - Each input will be attached to a function
        - Each input will have onChange and point to the corresponding function it is tied to
        - One last function that will specify what happens once you finish the form
    */

    function updateName(event: React.ChangeEvent<HTMLInputElement>) {
        newPokemon.name = event.target.value;

        setNewPoke(newPokemon);

        console.log(newPokemon.name);
    }

    function updateLevel(event:React.ChangeEvent<HTMLInputElement>) {
        newPokemon.level = +event.target.value;

        setNewPoke(newPokemon);
    }

    function updateHealth(event:React.ChangeEvent<HTMLInputElement>) {
        newPokemon.health = +event.target.value;

        setNewPoke(newPokemon);
    }

    function updateDamage(event:React.ChangeEvent<HTMLInputElement>) {
        newPokemon.damage = +event.target.value;

        setNewPoke(newPokemon);
    }

    function updateImg(event:React.ChangeEvent<HTMLInputElement>) {
        newPokemon.img = event.target.value;

        setNewPoke(newPokemon);
    }

    function onSubmit(event:React.FormEvent<HTMLFormElement>){
        event.preventDefault();

        // console.log(listOfPoke);

        setListOfPoke([...listOfPoke, newPokemon]);

        //Logic to add pokemon to our database
        axios.post<IPokemon>("http://smresteb-env.eba-u2i9uhvs.us-east-1.elasticbeanstalk.com/rest/addpokemon", newPokemon);
    }
}

export default PokemonList;