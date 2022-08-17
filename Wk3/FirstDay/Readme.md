# Deque Data Structure
* Represents a double ended queue
* Meaning you can add an element on the beginning of the queue as well as add an element at the end of the queue
* Ex: You browser function to be able to go back and forward on, undo functionality of an app, or if you want both a stack and a queue in one single data structure

# Iterable & Iterators
* It allows us to tell Java how can we iterate through our custom data structure we have made ourselves
* This gives our custom data structure capabilities such as using a foreach statement!
## Iterable interface
* It is used by Java to indicate that this custom data structure can be targeted/used by a foreach statement
## Iterator interface
* It is used by Java to indicate **how** we can actually iterate through the data structure
* It needs at least two methods from this interface to fully work
* next() will return the current element and then go to the next element
* hasNext() will check if there is even data left to iterate through

# Activity
* Re-create a custom Linked list or just use the one you already made
* Make that custom Linked list iterable using a foreach loop

# Hashing
* Just some function or algorithm that makes a numerical representation of an object
* Ex: student id, ssn, phone number
* Numbers are just a lot easier to find information and hashing is how it transforms an object into numbers
* So if you need to search/query quite a lot for a particular data structure, it is best to use a hash(something)
* We have to store more information so Space complexity if a bit higher but it is definitely better with Time complexity of finding algorithms
* Note: if you need your elements to be ordered in some shape or form, using hashing can't be used

## Collision Problems
* A problem when two or more objects have the same hash numerical representation
* To solve, it puts the two or more objects into a linked list and just iterate through it until it finds what it needs to
    * Fun fact, each linked list is called a bucket
* So overall, we filtered our elements into a few possible choices

## Examples of Java collections that uses hashing
* HashSet - Acts like a set (unique values, no duplication)
* HashMap - Acts like a map (key/value pair)

# Comparable Interface
* It allows us to tell Java how can I compare my custom made object with another object from the same class
* Essentially, comparable object is an object capable of comparing itself with another object
* You must implement compareTo() method
* Comparable is also used by other methods to do some sort of functionality
    * ex: Sorting

## Comparator Interface
* It allows us to also compare an object with other possible fields it may have
* Also allows us to sort with other possible fields as well by indicating it
* It is a separate class to compare by different field members

# Anonymous class
* Allows you to both declare and instantiate an object from a class
* Very useful to lower the clutter of .java files in your application especially if you just need to use the class once