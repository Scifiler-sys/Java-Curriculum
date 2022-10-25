package com.revature.springboot.service;

import java.util.Optional;

import com.revature.springboot.dao.PokemonBoxDao;
import com.revature.springboot.model.PokemonBox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class PokemonBoxService {

    @Autowired
    private PokemonBoxDao pokeBoxDao;

    public PokemonBox getPokemonBoxById(int id) {
        Optional<PokemonBox> foundPokeBox = pokeBoxDao.findById(id);

        if (foundPokeBox.isEmpty()) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }else {
            return foundPokeBox.get();
        }
    }
}
