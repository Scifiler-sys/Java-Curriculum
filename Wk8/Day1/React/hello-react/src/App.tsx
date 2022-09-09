import React from 'react';
import logo from './logo.svg';
import './App.css';
import FunctionalComponent from './components/FunctionComponent';
import ClassComponent from './components/ClassComponent';
import PokemonBox from './components/PokemonComponent/PokemonBox';

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

      <PokemonBox />
    </div>
  );
}

export default App;
