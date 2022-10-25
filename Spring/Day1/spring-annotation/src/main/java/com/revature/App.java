package com.revature;

import com.revature.config.AppConfig;
import com.revature.model.Pokemon;
import com.revature.service.AbilityService;
import com.revature.service.PokemonService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Using Spring via Annotations" );

        try (AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class)) {

            //Just like before, applicationcontext will go ahead and create the beans
            PokemonService pokeServ1 = container.getBean(PokemonService.class);
            PokemonService pokeServ2 = container.getBean(PokemonService.class);
            PokemonService pokeServ3 = container.getBean(PokemonService.class);
            
            Pokemon poke1 = container.getBean(Pokemon.class);
            Pokemon poke2 = container.getBean(Pokemon.class);
            Pokemon poke3 = container.getBean(Pokemon.class);

            System.out.println(poke1.getName());

            AbilityService abServ1 = container.getBean(AbilityService.class);
            

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
