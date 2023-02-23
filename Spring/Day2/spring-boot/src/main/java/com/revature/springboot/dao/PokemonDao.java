package com.revature.springboot.dao;

import org.springframework.stereotype.Repository;

import com.revature.springboot.model.Pokemon;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


//The generics is first the model this repository is suppose to be connected to
//The second is the datatype of the unique id this model is tied to
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
    

    //What if you want more customization than the basic CRUD opeations given to you?
    //Spring data uses a naming convention to create the method for you

    List<Pokemon> findByName(String name);

    List<Pokemon> findByNameAndLevel(String name, int level);
}
