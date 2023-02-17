import { useState } from "react";

/*
    Controlled components is whenever you have a state that have more control
        - by control I mean you check and validate that the state will have the information you want and also conforms to any business requirements
        - ex: password state in a register page
        - Now, in frontend, you have multiple ways to incorporate validation
    
        React recommended way of handling forms in your website. Mostly because this follows Encapsulation main purpose
*/
function ControlledComponent() {
    const [pokeId, setPokeId] = useState(0);
    
    return <div>
        <form onSubmit={onButtomSubmit}>
            <div>
                <label>PokemonId</label>
                {/* Now we have an input that will only take numbers and 1 > id */}
                <input type="number" min={1} onChange={onPokemonIdChange}/>
            </div>
        </form>
    </div>

    function onPokemonIdChange(event: React.ChangeEvent<HTMLInputElement>) {
        //Now you are free to add even more customized validation required here since it is a function

        //Adding a "+" syntax before a string will convert it into a number
        if (+event.target.value > 0) {
            setPokeId(+event.target.value);
        }
        else
        {
            //Some implementation detail to visually tell the user to correctly input the right data
        }
    }

    function onButtomSubmit(event: React.FormEvent<HTMLFormElement>) {
        //We want to prevent the default behavior of a form element of refreshing the entire page
        //This used to be useful in a normal vanialla HTML website but remember we are SPA, we don't refresh here
        event.preventDefault();

        //You can even perform any last minute validations here to really check that the right data is sent because trust me HTML validation is not... full proof
        console.log(pokeId);
    }

}

export default ControlledComponent;