/*
    A component in React has a lifecycle
    Think of a lifecycle of a person
    at age x we develop speech
    at age x we can drink alcohol

    a component has certain events in its life that we can utilize to automatically execute some functionality
    - Maybe you want to execute a clean up operation when the component dies?
    - Maybe you want to execute some implementation before the component renders to the website?

    If you use functional component, we use Hooks to mess with these lifecycle
    If you use class component, we use pre-made methods
*/

import React from "react";

type State = {
    count:number
}

class LifeCycleComponent extends React.Component<any, State> {

    //Executes before anything else (similar to java)
    constructor(props:any) {
        super(props);
        this.state = {
            count:0
        }
    }

    //Will execute next after component
    render() {
        return <div>
            {this.state.count}
            <button onClick={this.increment}>+</button>
            </div>
    }

    // increment() {
    //     this.setState({
    //         count:this.state.count + 1
    //     });
    // }

    increment = () => {
        this.setState({
            count:this.state.count + 1
        })
    }

    //Will execute after render() just once
    componentDidMount () {
        console.log("mount")

    }

    //One of the state changed in some shape or form
    componentDidUpdate() {
        console.log("updated")
    }

    //Will execute when the component dies/not rendered anymore
    componentWillUnmount() {
        console.log("unmounted")
    }
}

export default LifeCycleComponent;