import { IPokemon } from "./PokemonModel";

export interface ITrainer {
    id:number,
    name:string,
    totalBadge:number,
    listOfPokemon:IPokemon[]
}