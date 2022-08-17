package com.revature.dao;


import com.revature.models.Ability;
import com.revature.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AbilityDao {
    
    public int insert(Ability abi){
        Session ses = HibernateUtil.getSession();

        Transaction tx = ses.beginTransaction();

        int pk = (int)ses.save(abi);

        tx.commit();

        return pk;
    }
}
