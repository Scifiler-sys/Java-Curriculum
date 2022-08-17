package com.revature.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class PokeStorage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storageId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "pokeStorage_id")
    private List<Pokemon> pokemons;

    
    public PokeStorage() {
        pokemons = new ArrayList<Pokemon>();
    }
    public PokeStorage(String name) {
        this();
        this.name = name;
    }

    public int getStorageId() {
        return storageId;
    }
    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    
}
