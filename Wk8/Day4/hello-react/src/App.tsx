import React from 'react';
import logo from './logo.svg';
import './App.css';
import FunctionalComponent from './components/FunctionalComponent';
import ClassComponent from './components/ClassComponent';
import PokemonBox from './components/PokemonBox/PokemonBox';
import { IPokemon } from './models/PokemonModel';
import Counter from './components/Counter/Counter';
import ControlledComponent from './components/ControlledComponent';
import UncontrolledComponent from './components/UncontrolledComponent';

/*
  This is what a component looks like and how we will make ours as well

  The name of a component is determined by the name of the function
  hence in index.tsx, we used <App /> to reference this component

*/

function App() {


  /*
    The function returns something that looks very similar to HTML but it is NOT HTML
    it returns a JSX

    If you don't like idea of combining, Here is React official talk as to why they believe this is de way
    https://www.youtube.com/watch?v=x7cQ3mrcKaY

    Essentially this new language can combine HTML and JS together seamlessly
      - Ex: Want to put a HTML element inside a variable?? Yes you can
        You want to use a variable value inside a HTML element? Suuure no need to do document.querySelector() nonsense
  
    How about css? Nah React says, put it on a different file not really inline with their philosophy
  */

  

  const element = <h3>Wow I am storing an HTML element into a variable?!</h3>

  const someValue = "Hi I am a value";

  const imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png";

  const poke1: IPokemon = {
    damage: 100,
    health: 150,
    img: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png",
    level: 50,
    name: "Charizard"
  }

  const listOfPoke : IPokemon[] = [
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
  ]

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <p>Adding something new</p>
      
        {/* To reference your JS, make sure you use {} syntax */}
        {element}
        <p>{someValue}</p>
        <img src={imageUrl}/>

        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>

      <FunctionalComponent />
      <ClassComponent />

      <div className="container">
        {/* We are now required by TS to provide the values this component needs or else it will give us compilation error
            Fun fact, if you do React JS, it will instead give us a bunch of undefined

            But ain't nobody got time for writing all of this
        */}
        <PokemonBox name="Pikachu" level={10} img="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png" health={100} damage={150}/>

        {/* Using spread operator to act like what we did above*/}
        <PokemonBox {...poke1}/>

        {/* 
          Going even more advance and using a list of Pokemons and displaying it by using map a premade function for arrays 
          
          map function changes each element of the array into whatever you return
          list = [1, 4, 5, 6]
          
          list.map((element) => element * 2)

          console.log(list) // [2, 8, 10, 12]

          Something problematic with React when it comes to displaying lists using map method
            - You must supply keys for list items
            - Generally just using some uniquely identifieable property in the list will be perfect
            - Why does React need this? To help it identify the specific HTML elements and down the line also dynamically change them
              In the event you change the list information
          
          Here are scenarios that React gives you as to why you should add keys
          https://reactjs.org/docs/reconciliation.html#recursing-on-children

        */}
        {
          listOfPoke.map((pokemon) => {
            return <PokemonBox key={pokemon.name} {...pokemon}/>
          })
        }
      </div>

      <Counter />
      <ControlledComponent/>
        <UncontrolledComponent/>
    </div>
  );
}

export default App;
