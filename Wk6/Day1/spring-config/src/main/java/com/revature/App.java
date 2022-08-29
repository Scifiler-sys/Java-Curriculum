package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.AppConfig;
import com.revature.dao.PokemonDao;
import com.revature.models.Pokemon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "The old way of making our objects" );

        PokemonDao pokeDao1 = new PokemonDao();
        PokemonDao pokeDao2 = new PokemonDao();
        PokemonDao pokeDao3 = new PokemonDao();

        System.out.println("The new way of making our objects");

        //ApplicationContext handles our Beaniness
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PokemonDao pokeDao4 = appContext.getBean("PokemonDao", PokemonDao.class);
        PokemonDao pokeDao5 = appContext.getBean("PokemonDao", PokemonDao.class);
        PokemonDao pokeDao6 = appContext.getBean("PokemonDao", PokemonDao.class);
    
        
        System.out.println("Application of Bean that is not a good idea to do so");
        Pokemon poke1 = appContext.getBean("Pokemon", Pokemon.class);
        Pokemon poke2 = appContext.getBean("Pokemon", Pokemon.class);
        Pokemon poke3 = appContext.getBean("Pokemon", Pokemon.class);

        poke1.setName("Pikachu");
        poke2.setLevel(100);
        poke3.setHealth(67);

        System.out.println(poke1);
        System.out.println(poke2);
        System.out.println(poke3);
    }
}
