package com.revature.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * HibernateUtil class purpose is to handle connecting to the DB
 * It uses a Session class from hibernate framework
 * You can think of the Session class as the current connection to the DB
 */
public class HibernateUtil {

    //You can think of Session as the existing connection of the DB
    private static Session ses;

    /**
     * SessionFactory is designed to help us create a configuration object
     * This object will hold all the information required to connect to your DB
     * Hence why we are telling it to reference the hibernate.cfg.xml file which holds our credentials
     */
    private static SessionFactory sf = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

    // Similar to getConnection() in JDBC
    // Unlike what we did before, this was simplified down to a single method and it takes care of connecting to db
    public static Session getSession(){
        if (ses == null) {
            ses = sf.openSession();
        }

        return ses;
    }

    public static void closeSession() {
        /**
         * Closes/Ends the connection to our database
         */
        ses.close();
    }
}
