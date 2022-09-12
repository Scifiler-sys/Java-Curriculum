import React, { useState } from "react";
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

    const [listOfPoke, setListOfPoke] = useState<IPokemon[]>([
        {
          damage: 80,
          health: 100,
          img: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
          level: 32,
          name: "Bulbasaur"
        },
        {
          damage: 70,
          health: 120,
          img: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/151.png",
          level: 67,
          name: "Mew"
        },
        {
          damage: 89,
          health:56,
          img: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/813.png",
          level: 90,
          name: "Scorbunny"
        }
      ]);

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
                    return <PokemonBox key={poke.name} {...poke}/>
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

        console.log(listOfPoke);

        setListOfPoke([newPokemon, ...listOfPoke]);
    }
}

export default PokemonList;