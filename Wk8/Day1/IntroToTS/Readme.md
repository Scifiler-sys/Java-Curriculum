# Node.js
* It is a free and open-source JavaScript interpreter that allows us to run JS outside of a web browser
* Platform independent 
    * It can run on any OS you utilize
* Uses Google's chrome V8 engine

## Node Package Manager (NPM)
* It is similar to Maven, it can manage your dependencies and also grab them from the internet
* But unlike using pom.xml, it uses package.json file
* It will also store all of our dependencies in a folder called **node_modules**

# TypeScript (TS)
* It is an open-source language developed by Microsoft
* It suppose object-oriented programming (a bit better)
* It is a **superset** of JavaScript
    * All this means that Typescript has everything JavaScript has but it has more methods/tools (Ex: you have access modifiers, you have interfaces, etc.)
* It is strictly typed
    * Probably one of the best things about TS

## Transpilation process
* It is the process of converting our TS file into a JS
* All browsers (so far) only support JavaScript files and have no plans to change it to supporting TS any time soon. So to make TypeScript readily available for use for any web browsers, they created this transpilation process

## TS Datatypes
* Everything from JS
* Any
* Tuple
* Enums
* Never - Used for error handling
    * If you are interested, essentially if you place this with a function/method, it means that this function will never return anything. Void still returns "no value" while Never will never return anything.
    * So mainly used for error exceptions since that will end the program and not "complete" the function completely or in more rare cases, you want a function that will never end
* Void - Used for function/methods to indicate it will return nothing

## Access modifiers in TS
* public - access everywhere
* protected - access within the class and its subclasses
* private - access only within the class