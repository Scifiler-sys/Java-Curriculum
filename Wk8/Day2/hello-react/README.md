## Class vs Functional components
* Class components are just component made by using a class
* Function Components are components that are made using functions
    * Currently the most supported way you should go about making components in React
* Depending on which you pick, the syntax will look different on how you apply certain features in React
    * Ex: Doing props in function component looks very different class component

## Props and State
### Props
* Props are a great way to pass information into a component to be used/displayed
* You specify props within the parameter of the function component
* Whenever you use that component, you must provide the necesary information as well (UNLESS IT IS OPTIONAL!)
* A very big part of React to make components reusable

## Rendering Basics?

## Virtual DOM?

## Component Lifecycle
* Like with anything, a component have a lifespan. It will live and it will die. In coding, this means we have the power to control a component life (messed up I know). 
* All seriousness this means, if a component dies, do this behavior or run a function or do whatever you want
* If a component lives/reborns, do this behavior or run a function or do whatever you want
* Now why does this matter a lot in frontend?
    * There are scenarios where getting data from a database takes time. If we tell our component to render the page regardless if we got any data, we will get blank information
    * However, since we have control over its life, we can tell the component hold up man display AFTER you got the data
    * For you guys, you will use props, have perfect code, but you get blank component and most likely or not because of the lifecycle of a component
* Lifecycle is a class component exclusive, meaning you only use it with class component
* https://reactjs.org/docs/state-and-lifecycle.html

## Hooks
* A new way of messing with states rather than doing the old way
* https://www.youtube.com/watch?v=dpw9EHDh2bM (if you really have time to watch why they decided to make this move)
* Essentially no more dealing with lifecycle since Hooks will deal with them for you
* New information just came in and I have to re-render the page cause of it? Sure I can do that
    * With class components it took more boilerplate code to do it
* TLDR, if you have a dynamically changing information in your webpage use **HOOKS** or else they will **NOT** display the changes

