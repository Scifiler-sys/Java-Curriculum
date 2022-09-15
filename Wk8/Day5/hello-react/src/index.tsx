import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import PokemonList from './components/PokemonList/PokemonList';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import NavBar from './shared/NavBar/NavBar';
import { Provider } from 'react-redux';
import {store} from './shared/Redux/store';
import Login from './components/Login/Login';


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

root.render(
  <React.StrictMode>
    {/* We want everthing inside of provider because we are basically saying that this redux store will be available to all our components */}
    <Provider store={store}>
      {/* BrowserRouter starts it */}
      <BrowserRouter>
      <NavBar />

        {/* This is all the different routes this app will have */}
        <Routes>
          {/* The individual routes that points to a specific component as well as what is the endpoint necesarry to access them */}
          <Route path="/" element={<App />}/>
          <Route path="/pokeList" element={<PokemonList />}/>
          <Route path="/login" element={<Login/>}/>
        </Routes>
      </BrowserRouter>
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
