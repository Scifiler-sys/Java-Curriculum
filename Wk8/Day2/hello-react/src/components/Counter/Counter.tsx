// let counter = 0;

import { useState } from "react";


function Counter() {
    const [counter, setCounter] = useState(0);


    return <div>
        <p>Pokemon counter: {counter}</p>
        <button onClick={addCounter}>+</button>
    </div>


    function addCounter() {
        //This seems like it will work perfectly fine right? It will increase my count on the website


        // counter +=1 ;
        setCounter(counter + 1);
        console.log("Pokemon counter: " + counter);
    }
}


export default Counter;