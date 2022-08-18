package com.revature.dao;


import com.revature.models.PokeStorage;
import com.revature.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Will have a one to many relationship with Pokemon
 * 
 * One storage will hold many pokemons
 * A pokemon can only be inside one storage
 */
public class PokemonStorageDao {
    public int insert(PokeStorage pokeStorage){
        Session ses = HibernateUtil.getSession();

        Transaction tx = ses.beginTransaction();

        int pk = (int)ses.save(pokeStorage);

        tx.commit();

        return pk;
    }
}
