package com.revature.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

/*
    @Entity - Marks this class as something that should be mapped into our database
        - name would dictate what the table should be called in the database
*/
@Entity(name = "Pokemon")
public @Data class Pokemon {

    @Id //Would specify that this will be a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //Will auto-generate the primary key in increment by 1
    private int pokeid;
    private String name;
    private int level;
    private int damage;
    private int health;

    @ManyToOne
    @JoinColumn(name="boxId", nullable = false)
    private PokemonBox pokemonBox;

    public Pokemon() {
        this.name = "Pokemon not found";
    }

    public Pokemon(int pokeId) {
        super();
        this.pokeid = pokeId;
    }
}
