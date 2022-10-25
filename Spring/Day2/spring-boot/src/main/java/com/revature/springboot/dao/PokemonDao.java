package com.revature.springboot.dao;

import org.springframework.stereotype.Repository;

import com.revature.springboot.model.Pokemon;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PokemonDao extends JpaRepository<Pokemon, Integer> {
    /*
        - This is the power of Spring data, we now have all the capabilities to do any CRUD operation with Pokemon
        .save(), .delete(), .update() to name a few
        - Spring Data will look into our Pokemon model and will auto-generate the required SQL statements and also automatically map it 
        into a Pokemon object and all it took from us is just properly configuring it
        - We have complete abstraction over our DAO layer

        If you are wondering how it can find the class members from a class, it uses Reflection API
    */
    
}
