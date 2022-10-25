package com.revature.springboot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
public @Data class PokemonBox {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int boxId;

    @Value("Normal")
    private String environment;

    @OneToMany(mappedBy = "pokemonBox")
    private List<Pokemon> pokemons;

    public PokemonBox() {
        pokemons = new ArrayList<>();
        this.environment = "Normal";
    }
}
