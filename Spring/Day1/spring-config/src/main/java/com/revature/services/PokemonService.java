package com.revature.services;

import com.revature.dao.PokemonDao;

public class PokemonService {

    //Let's just say for some reason, this class needs a PokemonDao object to function properly
    //How can we tell our app that it is needed?

    // public PokemonService() {
    //     System.out.println("PokemonService object was created!");
    // }

    //=============== Implementation of Dependency Injection ===============
    
    //Make a private field of what this class will require to work
    private PokemonDao dao;

    //Create a constructor with object parameters that is required for this class to work
    public PokemonService(PokemonDao paramDao){
        System.out.println("Pokemon Service Object was just created");
        dao = paramDao;
    }

    //=======================================================================

    public PokemonService() {
    }

    public void needDaoToWork() {
        //This is what you guys have been doing for the longest time
        //This, however, does not tell the program that this pokemonservice needs this object
        // PokemonDao dao = new PokemonDao(); //We shouldn't even write this line of code because of (USE SPRING NOT YOUR OWN)
    }
}
