package com.revature.config;

import org.springframework.context.annotation.Bean;

import com.revature.dao.PokemonDao;

public class AppConfig {
    
    @Bean(name="PokemonDao")
    public PokemonDao getPokemonDao(){
        return new PokemonDao();
    }
}
