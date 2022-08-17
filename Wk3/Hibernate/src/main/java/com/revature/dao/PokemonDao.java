package com.revature.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.revature.models.Pokemon;
import com.revature.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * DAO - Data Access Object
 * It is a package designated to have access to the database (Equivalent to DL in C#)
 * Since this is a pokemonDao, this class will specifically interact with our Pokemon Table
 * Follow CRUD operations when making your Daos
 *  Create, Read, Update, Delete
 */
public class PokemonDao {
    
    // This method will add a row in our pokemon table
    public int insert(Pokemon poke){

        //Grabs our existing connection to the database
        //If it hasn't connected already, our logic in getSession() method will connect for us
        Session ses = HibernateUtil.getSession();

        //Creates our transaction
        //Transaction comes from Hibernate
        Transaction tx = ses.beginTransaction();

        //saves the pokemon object into a row in a pokemon table
        int primarykey = (int) ses.save(poke);


        // commits the transaction
        tx.commit();

        //Return the auto generated PK
        return primarykey;
    }

    public List<Pokemon> loadAllData(){
        //Grabs our session
        Session ses = HibernateUtil.getSession();

        /**
         * HQL - Hibernate Query Language
         * combination of native SQL and OOP
         * https://docs.jboss.org/hibernate/core/3.3/reference/en-US/html/queryhql.html
         */
        List<Pokemon> pokeList = ses.createQuery("from Pokemon", Pokemon.class).getResultList();

        return pokeList;
    }

    

}
