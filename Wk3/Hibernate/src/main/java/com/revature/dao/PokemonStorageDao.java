package com.revature.dao;


import com.revature.models.PokeStorage;
import com.revature.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PokemonStorageDao {
    public int insert(PokeStorage pokeStorage){
        Session ses = HibernateUtil.getSession();

        Transaction tx = ses.beginTransaction();

        int pk = (int)ses.save(pokeStorage);

        tx.commit();

        return pk;
    }
}
