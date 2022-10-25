package com.revature.springboot.controller;

import com.revature.springboot.model.PokemonBox;
import com.revature.springboot.service.PokemonBoxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemonbox")
public class PokemonBoxController {
    
    @Autowired
    private PokemonBoxService pokeBoxServ;
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public PokemonBox getPokeBox(@PathVariable("id") int id){
        return pokeBoxServ.getPokemonBoxById(id);
    }
}
