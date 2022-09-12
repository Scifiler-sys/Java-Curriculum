import { IPokemon } from "../../models/PokemonModel";
import "./PokemonBox.css"

/* 

    Will display pokemon info in a box UI

    Now is it really a good idea to have a component have hardcoded values?
    Will it really make that be reusable?

    Instead why not make our data dynamic? So the grand idea is we can display pokemonBox but each time we do, we have full capabilities of changing the information
    Making a component even MORE reusable

    To do this, we need to setup a new tool in React called Props
    - First make interface
*/

//Put things in this interface that you think you will need for this component
//I.E. put in the info that needs to be dynamically changed


function PokemonBox(props: IPokemon) {
    return <div className="box">
        {/* 
        Harded coded way which is baaad
        <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"/>
        <h4>Pikachu</h4>
        <p>Level: 10</p>
        <p>Health: 150</p>
        <p>Damage: 267</p> 
        */}

        <img src={props.img}/>
        <h4>{props.name}</h4>
        <p>Level: {props.level}</p>
        <p>Health: {props.health}</p>
        <p>Damage: {props.damage}</p>
    </div>;
}

export default PokemonBox;