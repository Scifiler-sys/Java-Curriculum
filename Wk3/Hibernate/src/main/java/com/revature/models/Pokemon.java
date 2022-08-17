package com.revature.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
/**
 * Java Persistence API
 * It has pre-made annotations that Hibernate uses to determine 
 * what to exactly make on the database
 */
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //Declares that this class will be a Entity (basically make this a table)
@Table(name="Pokemon") //We can use @Table to change the table name (By default, it will use the class name as table name)
public class Pokemon {

    @Id //Determines that this field will be a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This is equivalent to the SERIAL datatype in postgresql
    private int pokeId;

    @Column(unique = true, nullable = false) //Makes a column out of this field
    private String pokename;

    //Any empty field that doesn't have any annotations, Hibernate will automatically create a column w/ the correct datatype
    private int pokeHealth;

    private int pokeLevel;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
        name = "Pokemon_Ability",
        joinColumns = {@JoinColumn(name="pokemon_id")},
        inverseJoinColumns = {@JoinColumn(name="ability_id")}
    )
    private List<Ability> abilities;

    public Pokemon() {
        abilities = new ArrayList<Ability>();
    }

    public Pokemon(String pokename, int pokeHealth, int pokeLevel) {
        this();
        this.pokename = pokename;
        this.pokeHealth = pokeHealth;
        this.pokeLevel = pokeLevel;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public int getPokeId() {
        return pokeId;
    }

    public void setPokeId(int pokeId) {
        this.pokeId = pokeId;
    }

    public String getPokename() {
        return pokename;
    }

    public void setPokename(String pokename) {
        this.pokename = pokename;
    }

    public int getPokeHealth() {
        return pokeHealth;
    }

    public void setPokeHealth(int pokeHealth) {
        this.pokeHealth = pokeHealth;
    }

    public int getPokeLevel() {
        return pokeLevel;
    }

    public void setPokeLevel(int pokeLevel) {
        this.pokeLevel = pokeLevel;
    }

    @Override
    public String toString() {
        return "Pokemon [abilities=" + abilities + "\n pokeHealth=" + pokeHealth + ", pokeId=" + pokeId + ", pokeLevel="
                + pokeLevel + ", pokename=" + pokename + "]";
    }

    
}
