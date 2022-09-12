package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.revature.dao.PokemonDao;
import com.revature.models.Pokemon;
import com.revature.services.PokemonService;

/*
 * The purpose of AppConfig is to tell Spring how it should construct its Beans
 * 
 * Once you mention how to make those Beans, Spring will take care of all the optimization processes afterwards
 * Just like Servlet's web.xml, just a file for extra configuration to tell something what is inside our Java application
 * 
 * The biggest difference is that Servlet uses xml while Spring will use a ton of annotations
 */

public class AppConfig {
    
    /*
     * So remember Reflection API, @Bean annotation is what Spring will look for to create Beans
     * 
     * There are times when creation logic of objects are  alot more complicated but in our case, very simple at the moment
     */
    @Bean(name = "PokemonDao")
    public PokemonDao getPokemonDao(){
        return new PokemonDao();
    }

    @Bean
    public PokemonService getPokemonService(){
        return new PokemonService();
    }


    @Bean(name="Pokemon")
    @Scope("prototype")
    public Pokemon getPokemon(){
        return new Pokemon();
    }
}
