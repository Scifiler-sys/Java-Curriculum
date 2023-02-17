/*
    Opposite of ControlledComponent. No extra validation will be used to check on the state
    - Your website will also not re=render if that state was changed... because we aren't going to use useState hook
    - Not recommended to use in forms or generally
    - A lot less "setup" required to have it working
    - performance is better... but it is just negliable with today's js interpreter engine and computers
*/

import React from "react";

function UncontrolledComponent() {
    let inputRef = React.createRef<HTMLInputElement>();

    return <div>
    <form onSubmit={onButtomSubmit}>
        <div>
            <label>PokemonId</label>
            {/* Now we have an input that will only take numbers and 1 > id */}
            <input type="number" min={1} ref={inputRef}/>
        </div>
    </form>
</div>

    function onButtomSubmit(event: React.FormEvent<HTMLFormElement>) {
        event.preventDefault();

        console.log(inputRef.current?.value);
    }
}

export default UncontrolledComponent;