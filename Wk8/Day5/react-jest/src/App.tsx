import React from 'react';
import logo from './logo.svg';
import './App.css';
import Input from './components/Input';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>

      <Input label="Name" type="text" value="" />
      <Input label="id" type="number" value={0} />
      <Input label="health" type="number" value={10} />
    </div>
  );
}

export default App;
