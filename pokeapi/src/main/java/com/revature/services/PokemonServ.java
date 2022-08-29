package com.revature.services;

import com.revature.dao.PokemonDao;
import com.revature.dao.Repository;
import com.revature.models.Pokemon;

public class PokemonServ {
    //=========== Dependency Injection ===========
    private Repository<Pokemon> pokedao;

    public PokemonServ(Repository<Pokemon> pokedao) {
        this.pokedao = pokedao;
    }
    //============================================

    public Pokemon addPokemon(Pokemon pokemon){
        return this.pokedao.addInstance(pokemon);
    }
}
