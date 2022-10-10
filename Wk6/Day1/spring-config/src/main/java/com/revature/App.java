package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.AppConfig;
import com.revature.dao.PokemonDao;
import com.revature.models.Pokemon;
import com.revature.services.PokemonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "====The old way of making our objects====" );

        PokemonDao pokeDao1 = new PokemonDao();
        PokemonDao pokeDao2 = new PokemonDao();
        
        /**
         * We have errors here because we are now forcing our program that you MUST provide the required objects (our dependencies) 
         * whenever you make this particular object
         * 
         * Hence in the parameter of the contructor you have to pass a pokeDao object
         */

        PokemonService pokeServ1 = new PokemonService(new PokemonDao());
        PokemonService pokeServ2 = new PokemonService(pokeDao1);
        
        System.out.println("====The new way of making our objects====");

        //ApplicationContext handles our Beaniness
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PokemonDao pokeDao4 = appContext.getBean("PokemonDao", PokemonDao.class);
        PokemonDao pokeDao5 = appContext.getBean("PokemonDao", PokemonDao.class); //This is the safest way to grab a bean
        PokemonDao pokeDao6 = appContext.getBean(PokemonDao.class); //Another way of doing it (Watch out that this way will not work 100% of the time)

        /**
         * However, we did not recieve any problem with Spring's version at all
         * Since Spring will handle the dependencies of whatever object you are trying to create
         */
        PokemonService pokeServ3 = appContext.getBean("PokemonService", PokemonService.class);
        PokemonService pokeServ4 = appContext.getBean(PokemonService.class);
    
        System.out.println("====Application of Bean that is not a good idea to do so====");
        Pokemon poke1 = appContext.getBean("Pokemon", Pokemon.class);
        Pokemon poke2 = appContext.getBean("Pokemon", Pokemon.class);
        Pokemon poke3 = appContext.getBean("Pokemon", Pokemon.class);

        poke1.setName("Pikachu");
        poke2.setLevel(100);
        poke3.setHealth(67);

        System.out.println(poke1);
        System.out.println(poke2);
        System.out.println(poke3);

        System.out.println("====The old way of giving dependencies to an object that needs it====");
    }
}
