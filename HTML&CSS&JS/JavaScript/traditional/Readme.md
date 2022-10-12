# JavaScript
* Best way to make your website dynamically changed
* Dynamic & weakly typed
    * It assigns datatypes during the runtime/execution of your program
    * Variables are not attached to a datatype, meaning you can have a variable store strings at one point then have them store numbers at another point (it does not matter)
    * Intellisense won't be your friend
* It is an interpreted programming language
    * It reads your source code line by line and then feed that to an interpreter which then spits out machine code
    * Then it goes to the next line and so on...
    * But.. the story just got more complicated with modern tools
* It is mainly used to make our website more interactive/dynamic
    * Ex: Clicking buttons changes the content dynamically
* It is not both functional and object-oriented programming language
    * functional means we can make functions!
* Another very fun and different thing is Javascript can be run in multiple ways
    * Java can only run in JVM
    * This can run on Chrome v8, Firefox SpiderMonkey, Nodejs (although this uses Chrome V8)

## JavaScript Engine
* Example of JS Engine is Chrome V8
* JS still goes through an interpreter and converts your code line by line into bytecode and this process is relatively slow compared to compiled languages like Java
* To solve this inefficiency, this is where JS becomes a compiled language as well
* Using some sort of feedback loop after executing the bytecode, Chrome engine will detect certain patterns (such as repeatedly executing the same function numerous times) and compiles that part of your code into machine code! No longer going through the need of going through an interpreter if that function gets executed again
* This special compiler is called Just-In-Time compiler and essentially closing the gap of performance between a compile and interpreted language (By cheating since you are compiling at the end... so you know)

## Datatypes
* Primitives:
    * Numbers
    * Boolean
    * Strings
    * Null - Lack of value meaning this variable doesn't have any information at the moment
    * Undefined - no value was set meaning you just created a variable and didn't set it with any value
* Reference:
    * Objects
    * Functions
    * Arrays

# Prototype
* It is like a field in C# in a form of a key-value pair
* Every function (and other things) have prototypes and you can add prototypes as well
## Prototypal Inheritance
* The technical name that says you can inherit other prototypes so you have code re-usability

# Classes
* As you know, templates for creating objects
* Didn't use to exist which made things weird and divided some communities in JS
    * Essentially some people say to never use it because it's inefficient or error prone
    * Some people say to use it because it makes looking at your code easier to read (you should see example of how JS used to implement class-like things using just functions (spoiler alert: it looks gross))
* Has most of the OOP pillars we discussed and implements them easily except abstraction

# HTML DOM
* Allows JavaScript to specifically pick certain elements in the HTML and change/manipulate them based on whatever function you want
* This is what makes JS a powerful tool to making your html page dynamically change based on whatever the user is doing

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