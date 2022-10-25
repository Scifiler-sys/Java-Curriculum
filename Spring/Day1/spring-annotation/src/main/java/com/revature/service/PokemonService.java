package com.revature.service;

import com.revature.dao.PokemonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {

    //============== Dependency Injection ============== 
    private PokemonDao pokedao;

    public PokemonService(PokemonDao pokedao) {
        System.out.println("Creating an object out of "+ PokemonService.class);
        this.pokedao = pokedao;
    }

    //==================================================
    
}
