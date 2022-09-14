# React Redux
* A library that changes the game with state management
* Essentially, this is important if you plan on having a universal state that you need to share across multiple components everywhere
    * Ex: User credentials - Chances are most (if not all) will require some sort of user information to do their functionalities correctly
* It makes single point of access of all of your states
    * Kinda like one client-side database for your app
    * Your components will have access to it and have all the capabilities to change its information as well
    * All other components listening to the same state will also have the reflected change
* To install `npm install @reduxjs/toolkit react-redux`

## React Redux Store
* The centralized place for all of your state information needs
* The states are still **immutable**! So how do we change information?

## React State Slices
* This is like getting a slice of the Redux store
* 
