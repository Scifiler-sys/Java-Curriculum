package com.revature.service;

import com.revature.dao.PokemonDao;

public class PokemonService {

    //Pokemon Service now heavily depends on PokemonDao to actually do its job
    //In the event that pokemonDao was deleted or changed, PokemonService may or may not work anymore
    //It is very annoying whenever we make a change in code and then everything starts to break

    //Another big reason to do this extra step, Spring framework will heavily rely on you to write dependency injection to work properly
    //This will let Spring know that this Pokemon Service requires a Pokemon Dao object and MUST give it one
    //====================== Dependency Injection ========================
    PokemonDao pokeDao;

    public PokemonService(PokemonDao pokemonDao) {
        pokeDao = pokemonDao;
        System.out.println("PokemonService object was created!");
    }

    //====================================================================

    // public PokemonService() {
    //     super();
    // }

    public void someMethod() {
        System.out.println("Using a method in " + PokemonService.class);
    }
}
