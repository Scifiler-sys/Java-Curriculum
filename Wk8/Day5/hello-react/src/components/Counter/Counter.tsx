// let counter = 0;

import { useState } from "react";


function Counter() {
    const [counter, setCounter] = useState(0);
    const [show, setShow] = useState(false);

    //You can use normal if statement that have different code path for return statement to have your component dynamically change
    if (!show) {
        return <button onClick={()=>{setShow(true)}}>Click me to show Counter</button>
    }else {
        return <div>
            <p>Pokemon counter: {counter}</p>
                <button onClick={addCounter}>+</button>
            </div>
    }

    //Or you can use inline if Statement that I like to use to render things
    // return <div>
    //     <button>Click me to show Counter</button>
        
    //     {/* Inline if statement w/ && Operator to render certain things */}
    //     {
    //         show && <div>
    //             <p>Pokemon counter: {counter}</p>
    //             <button onClick={addCounter}>+</button>
    //         </div>
    //     }
        
    // </div>


    function addCounter() {
        //This seems like it will work perfectly fine right? It will increase my count on the website
        // counter +=1 ; This is because States are IMMUTABLE! You must use the method
        setCounter(counter + 1);
        console.log("Pokemon counter: " + counter);
    }

}


export default Counter;