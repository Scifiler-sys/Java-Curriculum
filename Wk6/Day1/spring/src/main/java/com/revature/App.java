package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.config.AppConfig;
import com.revature.dao.PokemonDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Creating Application Context" );

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        PokemonDao pokeDao = appContext.getBean("PokemonDao", PokemonDao.class);

        PokemonDao pokeDao2 = appContext.getBean("PokemonDao", PokemonDao.class);
    }
}
