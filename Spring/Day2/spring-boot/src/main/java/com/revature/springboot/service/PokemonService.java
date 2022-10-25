package com.revature.springboot.service;

import java.util.List;
import java.util.Optional;

import com.revature.springboot.dao.PokemonDao;
import com.revature.springboot.model.Pokemon;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PokemonService {

    @Autowired
    private PokemonDao pokeDao;

    public List<Pokemon> getAllPokemon(){
        return pokeDao.findAll();
    }

    public Pokemon getPokeById(int id) {
        //Optional class is essentially made like a promise
        //There is a chance that this variable will hold something or nothing
        Optional<Pokemon> foundPoke = pokeDao.findById(id);

        //isEmpty method will check first if it is null or not
        //Then using a simple if, we can account for the event that pokemon was not found
        if (foundPoke.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pokemon was not found");
        }else {
            return foundPoke.get();
        }
    }

    public Pokemon addPokemon(Pokemon newPoke){
        return pokeDao.save(newPoke); //This will also update/replace if the pokemon have the same id
    }

    public void deletePokemon(int pokeId){
        pokeDao.delete(new Pokemon(pokeId));
    }
}
