# Functional Interfaces
* What Java learned from Javascript (Maybe I didn't really )
* It is an interface that contains only one abstract method
* Also called SAM (Single Abstract Method)
* It is utilized to create lambda expressions ( params -> implementation)
* Overall they make our code cleaner and easier to follow

## Function vs Methods
* The same logic as the difference between field and a variable
* A method is inside a class while a function is not inside any class

## Pre-made functional interfaces given by Java
* Supplier interface
    * Represents a function which doesn't take any parameters but returns something
    * Similar to functionalInterface2 except it is generic
    * The one abstract method is called get() unlike our hello2()
* Consumer interface
    * Represents a function which takes only a **single** parameter and doesn't return anything
    * Similar to functionalInterface3 except it is generic
    * The one abstract method is called accept()
* Predicate interface
    * Represents a function which gives a boolean result given one parameter
    * TLDR: if you come across making a lambda that takes one parameter and returns a boolean then you can use a Predicate!
    * Useful for unit testing

# Stream API
* It is used to process a collection of objects
* Basically a cool way to filter our collections
* Note: A stream is NOT a collection. It is a sequence of object references that support a variety of methods that can be used to produce a desired result
    * It never changes the data source it is using

## Terminal stream operations
* Keyword is terminal meaning the end
* You have a couple pre-set methods that will end the stream api and give some sort of output depending on which one you picked