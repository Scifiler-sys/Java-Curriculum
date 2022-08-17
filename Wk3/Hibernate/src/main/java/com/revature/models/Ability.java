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
import javax.persistence.ManyToMany;

@Entity
public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int abId;

    private String name;
    private int PP;
    private int Power;
    
    @ManyToMany(mappedBy = "abilities")
    private List<Pokemon> pokemons;

    public Ability() {
        pokemons = new ArrayList<Pokemon>();
    }
    public Ability(String name, int pP, int power) {
        this();
        this.name = name;
        PP = pP;
        Power = power;
    }

    

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public int getAbId() {
        return abId;
    }
    public void setAbId(int abId) {
        this.abId = abId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPP() {
        return PP;
    }
    public void setPP(int pP) {
        PP = pP;
    }
    public int getPower() {
        return Power;
    }
    public void setPower(int power) {
        Power = power;
    }

    @Override
    public String toString() {
        return "Ability [PP=" + PP + ", Power=" + Power + ", abId=" + abId + ", name=" + name + "]";
    }
}
