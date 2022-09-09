/*
    Typescript must be installed via NPM
        - npm install -g typescript
    
    Must transpile TS into JS for any web browser to use it
        - tsc [TS filepath]
        - tsc -w [TS filepath] - will auto transpile given there is a change in the file
        - tsc -w es[2016] [TS filepath] - will auto transpile and use EC6
*/

console.log("===Variables===");
//Typescript will automatically assign s1 into a String because that is the value we set it at initialization
let s1 = "Hello";

// s1 = 10; //We have strong type back!
console.log(s1);

let n1:number; //Assigning n1 variable to be a number datatype only
// n1 = "10";
n1 = 10;

console.log(10);

//ANY - the default datatype of a declared variable, you can store any datatype (basically vanilla JS)
let a1;
a1 = "World";
a1 = 5;
a1 = true;

console.log(a1);

//You can pair multiple datatypes into a single variable
let m1: string | number ;
m1 = "Hello";
m1 = 10;
// m1 = false; Does not work

//Arrays
let arr1:any[]; //Will have an array that can hold any datatype
arr1 = ["String", 10, true]; 
console.log(arr1);
arr1.push(80);
console.log(arr1);


let arr2:(number | boolean)[];
arr2 = [2, 43, 54, true, false];

let arr3:number | boolean[];
arr3 = 3;
arr3 = [false, true, false, false];
// arr3 = [12, 32, 43,12] Doesn't work

//Tuple - It is like an array but can only contain fixed size and order of the datatypes matter
let tul1 : [number, string];
tul1 = [10, "Order matters"]

let tul2: [string, boolean, number];
tul2 = ["Order matters", true, 10];

//Enum - works like a normal enum in Java
enum Engine {
    Off = 0,
    Idle = 1,
    Accel = 2
}

let engineState = 0;

if (engineState == Engine.Off) {
    console.log("The engine is off");
}

console.log("===Functions===");

function myFunc(para1:number, para2:string) : void {
    console.log(`para1: ${para1} para2: ${para2}`);
}

myFunc(10, "String");

function myFunc2(para1:string) : string {
    return para1;
}

console.log(myFunc2("Hello World"));

console.log("===Interfaces===");

// A great way to ensuring that whatever object you are making from this interface, it must follow the exact format
//Naming convention with interfaces starts with an I, this is what we do in C# as well (remember TS was made by Microsoft)
interface IPokemon {
    name:string,
    level:number,
    health:number,
    damage:number,
    speed?:number, //You can have optional properties

    talk():void, //Like interface in Java, whoever uses this interface must provide implementation details for this method

    attack(move:string):string,

    optionalFunction?():void; //Even works with methods
}

let poke1:IPokemon

poke1 = {
    name: "Pikachu",
    level: 100,
    health: 1000,
    damage: 150,

    // speed: 100 It will not work since Pokemon interface doesn't have speed
    talk: () => {
        console.log("Pika pika!");
    },

    attack: (move:string) => {
        //A bit weirder to refer to the object's own properties
        return `${move} and damage is ${poke1.damage}`;
    }
}

// poke1.speed = 100; It will not work since Pokemon interface doesn't have speed
// Intellisense will also help out a bit more since it can detect what fields this object will exactly have
console.log(poke1);
poke1.talk();
console.log(poke1.attack("Tackle"));

/*
    Like in Java
     - You can inherit multiple interfaces
     - You can add generics with your interfaces
     - Unlike Java, you can have optional properties
*/

//Look we have intellisense back, god bless TS
class Electric implements IPokemon {
    /*
        Access modifiers are back!
        public - by default, everything has this access modifier
        protected
        private

    */


    name: string;
    level: number;
    health: number;
    damage: number;
    speed?: number | undefined; //This is what optional does inheritly, it will make that property both the datatype or undefined cause it is possible you didn't give it any value

    protected type:string;

    //Encapsulation achieved easily with access modifier
    private passive:string;

    constructor() {
        this.name = "Pikachu";
        this.level = 10;
        this.health = 100;
        this.damage = 1000;

        this.type = "Electric";
        this.passive = "Spark";
    }

    talk(): void {
        throw new Error("Method not implemented.");
    }

    attack(move: string): string {
        throw new Error("Method not implemented.");
    }

    //This is how you make a getter and setter
    //Like in Java, Encapsulation will give us better control of our data
    //Very similar to C#, we also do PascalCase for our getter & setter
    get Passive() {
        return this.passive
    }

    set Passive(passive:string) {
        this.passive = passive + "Poke Passive Invoked!";
    }
}

let pika:Electric = new Electric();

console.log(pika.name);
// console.log(pika.type); Doesn't work due to the access modifier

//With getter and setter, you can call on it like a normal field and set and get its information
/*
    Unlike Java which you have to do 
    pika.setPassive("Sparkv2")
    console.log(pika.getPassive())

    so overall, just a little bit less of code needed to type
*/
pika.Passive = "Sparkv2";
console.log(pika.Passive);