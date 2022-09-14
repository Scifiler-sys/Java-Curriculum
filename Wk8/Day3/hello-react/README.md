# React Routing
* A React library that allows us to switch between components as if we are switching pages in your traditional routing in HTML
* Good idea to establish the routing component in index.tsx, our main entry point for our components
* Since it is an extra dependency, we have to mess with our NPM once again 
    * npm install react-router-dom@6

# Axios
* A way to communicate with an external API or your very own API
* It is a more abstracted form of using your normal AJAX capabilities in vanilla JS
    * It uses XMLHTTPRequest at the back
* Can be added by running `npm install axios`

## Why use Axios over Fetch?
* It can automatically convert your JSON into JS objects to start using
* Has protection for XSRF (Cross-site Request Forgery)
* Make cool progress bars when getting packets from large information you are sending in the internet
* For our case, it is just "easier" to type it out and less boilerplate code
    * It looks like Angular Httpclient tbh

## Lifting State
* This is when you "lifted" a state to a higher component so that all of the (peasant) child components can share a universal value
    * You can think of it as like a singleton variable all child components will see
* Child to Parent communcation is needed for the operation
    * Since if one of the child components decided to change that universal value, then everyone else must follow
* **You must put the state to the common ancestry of all the child components (Their parent basically)**