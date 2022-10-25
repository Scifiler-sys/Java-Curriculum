package com.revature.service;

import com.revature.dao.AbilityDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*

    What if you don't want to use dependency injection DP to let Spring know what dependency this class will depend on?    

*/
@Component
public class AbilityService {

    /*
        Another way to setup dependency injection by just adding Autowire into a field
        TLDR: Autowire annotation is used to inject beans that currently exists
            - It can be applied in a field, setter, or even a constructor
    */
    @Autowired
    private AbilityDao abDao;

    public AbilityService() {
        System.out.println("Creating object out of " + AbilityService.class);
    }

    /*
        This is called setter injection
        Works the same as dependency injection, in which, Spring will give this AbilityService an AbilityDao Bean
    */
    // @Autowired
    // public void setAbilityDao(AbilityDao abDao){
    //     this.abDao = abDao;
    // }
}
