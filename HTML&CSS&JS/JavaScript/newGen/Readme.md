# HTML DOM
* Allows JavaScript to specifically pick certain elements in the HTML and change/manipulate them based on whatever function you want
* This is what makes JS a powerful tool to making your html page dynamically change based on whatever the user is doing
* The main idea is that JS uses objects and functions as its way to interact while HTML uses elements to interact. So a DOM was made so Javascript will know how to interact with HTML since they have different architecture on how things are done

# Classes
* As you know, templates for creating objects
* Didn't use to exist which made things weird and divided some communities in JS
    * Essentially some people say to never use it because it's inefficient or error prone
    * Some people say to use it because it makes looking at your code easier to read (you should see example of how JS used to implement class-like things using just functions (spoiler alert: it looks gross))
* Has most of the OOP pillars we discussed and implements them easily except abstraction

# Introduction to sending and receiving data in JS
## AJAX
* Asynchronous JS and XML
* Used to grab information only with XML type backend server hence the name
    * But they want ahead and updated the object to also include JSON to be relevant
## Fetch
* Similar to AJAX except less syntaxes or prepping needed to call on backend
* Main difference from AJAX is it uses promises to achieve asynchrnous operations
### Promises
* Represents either the completion or failure of an asynchronous operation
* Allows you to "setup" what to do after a completion of a promise and get its result and also account for a failure of a promise and what to do using "then()".

## Nice to know with JS
### Scopes
* The scope of a variable determines where it has access to
* Block
    * Cannot be access from outside {}
    ```JS
    {
        let x = 2;
    }
    //Anything outside cannot see that x variable
    ```
* Function scope
    * Each function you create is a new scope
    * Kinda like methods in C# in that variables created in the function only stays in that function
* Function scope
    * Can be access anywhere in JS
    * Var keyword that will give variable a global scope
    ```JS
    {
        var x = 2;
    }
    //Anything outside this block scope still has access to x because it is functional scope
    ```
* let keyword limits the scope of the variable depending on where it was declared
    * Mostly use "let" to try your best to avoid conflicting variable names