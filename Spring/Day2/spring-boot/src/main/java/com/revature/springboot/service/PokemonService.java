package com.revature.springboot.service;

import java.util.List;
import java.util.Optional;

import com.revature.springboot.dao.PokemonBoxDao;
import com.revature.springboot.dao.PokemonDao;
import com.revature.springboot.model.Pokemon;
import com.revature.springboot.model.PokemonBox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PokemonService {

    @Autowired
    private PokemonDao pokeDao;

    @Autowired
    private PokemonBoxDao pokeBoxDao;

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

    // public Pokemon addPokemon(Pokemon newPoke){
    //     return pokeDao.save(newPoke); //This will also update/replace if the pokemon have the same id
    // }

    //Transactional annotation will create a new transaction in SQL
    //It will have all the benefits transaction gives in SQL
    //General rule - use it if you plan on utilizing multiple SQL statements
    @Transactional(propagation = Propagation.REQUIRED)
    public Pokemon addPokemon(Pokemon newPoke) {
        
        Optional<PokemonBox> currentPokeBox = pokeBoxDao.findById(newPoke.getPokemonBox().getBoxId());
        PokemonBox found;

        if (currentPokeBox.isEmpty()) {
            found = pokeBoxDao.save(new PokemonBox());
        }else {
            found = currentPokeBox.get();
        }

        newPoke.getPokemonBox().setBoxId(found.getBoxId());
        return pokeDao.save(newPoke);
    }

    public void deletePokemon(int pokeId){
        pokeDao.delete(new Pokemon(pokeId));
    }
}
