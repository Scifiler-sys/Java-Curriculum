import React from "react";

/* 
    Class components are just component made by using a class
    Not used as much mostly because React shifted their philosophy into thinking that
    REACT COMPONENTS MUST ACT LIKE PURE FUNCTIONS
*/

class ClassComponent extends React.Component{

    render() {
        return <div>
            Class Component is working!
        </div>
    }
}

export default ClassComponent;