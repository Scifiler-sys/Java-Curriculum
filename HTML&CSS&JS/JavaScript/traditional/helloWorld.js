console.log("This is similar to System.out.printLine()");

console.log("===Variables===");

let x = "Hello";
console.log(x);
x = 10.8;
console.log(x);
x = true;
console.log(x);

console.log("Undefined vs. Null");
let y;
let u = null;
console.log(y);
console.log(u);

// Now let's get even weirder
console.log("===Objects===");

//You can make objects without classes!
let pokeobj = {
    name: "Pikachu",
    level: 10,
    health: 100,
    damage: 20,

    talk(){
        console.log("Pika Pika!");
    }
}

console.log(pokeobj);
console.log(pokeobj.health);
console.log(pokeobj.abilities); //This is why undefined exists because it is perfectly legal to try to call something that doesn't exist
pokeobj.talk(); //Also possible to add behaviors into objects

console.log("===3 ways to make Functions===");

function MainWay() {
    console.log("Main function invoked");
}

let arrfunc = () => {
    console.log("Arrow function invoked");
}

MainWay();

arrfunc();

console.log(arrfunc);

function callBackDemo(theActualCallBackFunction) {
    theActualCallBackFunction();
}

callBackDemo(arrfunc);

callBackDemo(MainWay);

