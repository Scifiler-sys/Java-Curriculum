package com.revature.config;

import com.revature.dao.AbilityDao;
import com.revature.dao.PokemonDao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature") //Specifying Spring to locate components/beans inside this package
public class AppConfig {
    
    /*
        If you don't want Spring do the construction of the objects for you, you can also do it pretty much manually and have more "control"
        You utilize @Bean annotation to define this method as a way to create a Bean manually
        You also don't need to supply @Component annotation on the class
    */

    @Bean(name = "PokemonDao")
    public PokemonDao getPokemonDao(){
        System.out.println("Executing some sort of custom behavior when making this object specifically");
        return new PokemonDao();
    }
}
