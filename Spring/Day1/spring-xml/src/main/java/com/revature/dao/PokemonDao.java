package com.revature.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PokemonDao{
    public PokemonDao() {
        System.out.println("PokemonDao object was created!");
    }

    public void someMethod() {
        System.out.println("Using a method in "+PokemonDao.class);
    }

    public void someCustomInitBehavior() {
        System.out.println("Custom Init is invoked");
    }

    public void someCustomDestroyBehavior() {
        System.out.println("Custom Destroy is invoked");
    }
}
