package com.revature.springboot.controller;

import java.util.List;

import com.revature.springboot.model.Pokemon;
import com.revature.springboot.service.PokemonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    
    @Autowired
    private PokemonService pokeServ;

    //RequestMapping annotation will route certain http request to run this specific method
    //It takes in http verb and a url routing
    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Pokemon> GetAllPoke() {
        return pokeServ.getAllPokemon();
    }

    //By default, adding something in the parameter will expect it to be JSON
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Pokemon AddPokemon(@RequestBody Pokemon newPoke){
        return pokeServ.addPokemon(newPoke);
    }

    //To configure request parameters
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    public void DeletePokemon(@RequestParam(name="id") int pokeId){
        pokeServ.deletePokemon(pokeId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update")
    public Pokemon UpdatePokemon(Pokemon updatePoke){
        return pokeServ.addPokemon(updatePoke);
    }

    //To configure url parameters
    @RequestMapping(method = RequestMethod.GET, value = "/{pokeId}")
    public Pokemon getPokeById(@PathVariable("pokeId") int pokeId){
        return pokeServ.getPokeById(pokeId);
    }
}
