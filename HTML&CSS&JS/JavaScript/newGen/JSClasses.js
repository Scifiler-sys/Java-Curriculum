/*
    The incomplete attempt of trying to implemenet OOP within JS
    However, it is infinitely better syntax wise when implementing OOP using just functions
    It has some working implementation of OOP pillars but not all
*/

let dog = {
    color: "Black",
    size: 40,
    speak: function() {
        console.log("Bark Bark!");
    },
    howBig: function() {
        //You must use the "this" keyword to specify you are using the object's own properties
        console.log("The dog is "+this.size+"lbs!");
    }
}

console.log(dog);
dog.speak();
dog.size = 192;
dog.howBig();

//This is a class almost similar but doesn't have access modifiers (since that doesn't exists in JS)
class Animal {
    //How to create a constructor
    constructor(name){

        //This automatically creates a field in the class called name
        this.name = name;
    }
    
    //How to create a method (notice no return datatype required or access modifier)
    speak(){
        console.log("Hello");
    }
}

//Inheritance works the same way as Java
class Dog extends Animal {
    //public field
    //The only closes thing to having access modifiers
    color = "Black";

    //private field
    //Useful for encapsulation
    #size = 20;

    constructor(color, size, name){
        super(name);
        this.color = color;
        this.#size = size;
    }
    
    //This is a method
    //Method Overriding
    speak() {
        super.speak(); //To call on parent's method
        console.log("Bark! Bark!");
    }

    //Polymorphism doesn't work that well and can't do method overloading
    // speak(word){
    //     console.log(word);
    // }
    whatColor() {
        //Will this work to refer the variable inside of the class?
        //This keyword is what will refer to the field inside of the class
        //THIS IS VERY IMPORTANT OR ELSE YOU GET SOME WEIRDNESS
        console.log("The dog is "+this.color+".");
    }

    howBig() {
        //Must create methods to access private fields
        console.log("The dog is "+this.#size+"lbs!");
    }

    //Very similar to how C# does properties
    //There is such a thing called javascript properties but have no correlation to C# properties
    //These are just called getters and setters
    //Getter
    get Size(){
        return this.#size;
    }

    //Setter
    set Size(p_size){
        this.#size = p_size;
    }
}

let dog1 = new Dog("Black", 20, "Minnie");
dog1.speak();
let color = "White";
dog1.whatColor();
dog1.howBig();
console.log(dog1.color);
// console.log(dog1.#size); //Cannot access due to it being private
console.log(dog1.Size);
dog1.Size = 30;
console.log(dog1.Size);

//Be careful with doing this because it seemed like I set the size variable but not really
//Instead JS created a new field inside the object called size that is public and sets its value
//... yes you can set fields on an already made object unlike C# where it is very strict
dog1.size = 200;
console.log(dog1.size);
console.log(dog1);

//Inheritance
console.log(dog1.name);

//Method overriding
dog1.speak("Doggy is talking");