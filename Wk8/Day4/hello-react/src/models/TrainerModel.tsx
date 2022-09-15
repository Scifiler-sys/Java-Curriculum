import { IPokemon } from "./PokemonModel";

export interface ITrainer {
    trainid:number,
    tname:string,
    totalBadges:number,
    listOfPokemon:IPokemon[]
}