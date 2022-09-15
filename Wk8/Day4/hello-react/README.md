# React Redux
* A library that changes the game with state management
* Essentially, this is important if you plan on having a universal state that you need to share across multiple components everywhere
    * Ex: User credentials - Chances are most (if not all) will require some sort of user information to do their functionalities correctly
* It makes single point of access of all of your states
    * Kinda like one client-side database for your app
    * Your components will have access to it and have all the capabilities to change its information as well
    * All other components listening to the same state will also have the reflected change
* To install `npm install @reduxjs/toolkit react-redux`
### Setting up
* npm install
* Create store
* Configure index.tsx to add provider
* Create hook
* Create slicer
* Add slicer to store
* use custom hooks properly


## Redux Store
* The centralized place for all of your state information needs
* The Redux Store is immutable and an important facts and the main reason why Redux Reducers exists
* The states are still **immutable**! So how do we change information?

## Redux Reducers
* They are an extra step process in which you specify how should Redux change the value of the state
* They take in the current state and redux action as arguments

## Redux Action
* An object that contains `payload` that has all the information we are using to change the state stored in the store in some shape of form
* They call it "action" because every time you sent information from the view that is usually done by doing some sort of action within the view (like clicking a button)

## Redux Selectors
* It is like the Redux version of React useState hook
* Meaning it will grab the latest information stored in the store
* In the event that information changes, it will re-render your website accordingly like useState hook
* One cool thing, you don't need to have a setter method unlike useState because we have dispatchers/actions to do it for us

## React State Slices
* All in one place that will hold your reducers and actions

