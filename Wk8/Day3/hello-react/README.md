## What is a component?
* It is a single UI/graphic that is independent and reusable.
* You can think of puzzle pieces, by itself it has a piece of a picture, together with other puzzle pieces you get an image
* TLDR: you make components to reuse them in your website and they are a tiny piece of your app that makes up a whole page
* Class Component - They are components made by creating a class and extending React.Component
* Function Component - They are components made by creating a function

## JSX
* An extension of JavaScript.
* It gives us all the power to combine both HTMl and JS and have them pass/use data pretty easily
* This goes back to the philosophy React believes in, which everything should be at one place
* Less known reasons why use JSX:
    * We heavily use JavaScript to render our webpages and that comes with some major risks with JS injection attacks (Also known as XSS). Using JSX prevents such attacks.
* Ex: Storing an HTML element into a JS variable, using JS variable to display on a HTML element

## Class vs Functional components
* Class components are just component made by using a class
* Function Components are components that are made using functions
    * Currently the most supported way you should go about making components in React
* Depending on which you pick, the syntax will look different on how you apply certain features in React
    * Ex: Doing props in function component looks very different class component

## Props
* Props are a great way to pass information into a component to be used/displayed
* You specify props within the parameter of the function component
* Whenever you use that component, you must provide the necesary information as well (UNLESS IT IS OPTIONAL!)
* A very big part of React to make components reusable

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

## States
* While props are used to transfer information into the component to use
* States are used within the component to re-render your web page with dynamically changing variables/information
* States are **immutable**, you must use the useState method to change the information and have it reflect

## Virtual DOM
* Whenever we interact with the "DOM" in React using React specific things such as hooks or jsx, we are actually messing with a virtual DOM
* Yes there is two DOMs in React
* React will looking into the virtual DOM and compare it with the real HTML DOM, based on the difference between the two, it will only change the real DOM on the differences
* This is to optimize the process of changing your real DOM by specifically targetting certain sections to it and changing it
* This syncing process is called **reconciliation**
* TLDR: this is why we don't do document.querySelector() anymore, React will take care of all the real DOM manipulation

## Conditional Rendering
* When you want to render/display certain things in React based on well a condition