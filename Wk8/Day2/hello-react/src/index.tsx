import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

/*
  Index.tsx is your entry point of your website. 
  Anything in here is what will be display

  Since React is SPA, this is going to the main HTML page that will be serve first
*/


//==============
//You can see how React selects the div element with an id of root from our index.html
//It will then append our componenets to that div using JS
const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
//==============

//This section is responsible for rendering our components in whatever order youw ant
root.render(
  <React.StrictMode>
    {/* This is a component called App which came from App.tsx */}
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
