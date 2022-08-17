package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.AbilityDao;
import com.revature.dao.PokemonDao;
import com.revature.dao.PokemonStorageDao;
import com.revature.models.Ability;
import com.revature.models.PokeStorage;
import com.revature.models.Pokemon;

/**
 * Hello world!
 *
 */
public class App 
{
    static PokemonDao pokedao = new PokemonDao();
    static PokemonStorageDao storagedao = new PokemonStorageDao();
    static AbilityDao abdao = new AbilityDao();

    public static void main( String[] args )
    {
        System.out.println( "Running Hibernate Demo!" );

        //Inserting pokemon into DB
        Pokemon p1 = new Pokemon("Pikachu", 100, 1);
        Pokemon p2 = new Pokemon("Ditto", 50, 1);
        Pokemon p3 = new Pokemon("Bulbasaur", 150, 2);

        //One to many relationship demo
        PokeStorage storage = new PokeStorage();
        storage.setName("Box 1");
        storage.getPokemons().add(p1);
        storage.getPokemons().add(p2);
        storage.getPokemons().add(p3);

        storagedao.insert(storage);

        //Many to many relationship demo
        Ability a1 = new Ability("Tackle", 100, 20); 
        Ability a2 = new Ability("Thunderbolt", 80, 80);
        Ability a3 = new Ability("Vine whip", 100, 30);

        p1.getAbilities().add(a1);
        p1.getAbilities().add(a2);
        p2.getAbilities().add(a1);
        p3.getAbilities().add(a1);
        p3.getAbilities().add(a3);

        pokedao.insert(p1);
        pokedao.insert(p2);
        pokedao.insert(p3);

        //Retrieving pokemon from DB
        List<Pokemon> listOfPoke = pokedao.loadAllData();

        for (Pokemon pokemon : listOfPoke) {
            System.out.println(pokemon);
        }
    }
}
