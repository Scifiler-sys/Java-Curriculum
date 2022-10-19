package com.revature;

import com.revature.dao.PokemonDao;
import com.revature.model.Pokemon;
import com.revature.service.PokemonService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");


        /*
            Essentially, everytime you create an object out of pokemon service class, it will create two objects
            This can lead to space inefficiency especially when using a class that has no state (It only has methods inside of the class)
        
            This is where singleton becomes pretty useful in terms of efficiency. 
            However, making singleton manually and also keeping up with it to ensure you don't accidentally break something is hard to do
        */

        PokemonDao pokeDao = new PokemonDao();
        PokemonService pokeServ = new PokemonService(pokeDao);
        PokemonService pokeServ2 = new PokemonService(pokeDao);
        PokemonService pokeServ3 = new PokemonService(pokeDao);

        //All these method do the exact same thing so why make so many objects out of it?
        pokeServ.someMethod();
        pokeServ2.someMethod();
        pokeServ3.someMethod();

        System.out.println("============= Making Stateful Objects =============");
        Pokemon poke1 = new Pokemon("Pikachu", 1, 100);
        Pokemon poke2 = new Pokemon("Ditto", 2, 150);
        Pokemon poke3 = new Pokemon("Bulbasaur", 3, 500);
        
        //Having multiple objects with a stateful class is really useful. Mostly because each object aren't necessarily the same as the other objects
        //Doing a singleton with these, are a bad idea (UNLESS you want a centralize object that shares the same info)
        System.out.println(poke1.getName());
        System.out.println(poke2.getName());
        System.out.println(poke3.getName());

        System.out.println("===================== Spring way to creating objects =====================");

        //Creating the IoC container and using XML to configure
        try (ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml")){
            System.out.println("Created the Spring IoC container");

            /*
                As you note:
                Making the Spring IoC container automagically created our PokemonDao object for us
                It is then our job to just use this bean and have our reference variable point to it
            */


            // Making beans the Spring way
            PokemonDao pokemonDao = container.getBean(PokemonDao.class); //This relies on Spring to find the object for us
            PokemonDao pokeDao2 = container.getBean("pokemonDao",PokemonDao.class); //This is very specific

            pokemonDao.someMethod();
            pokeDao2.someMethod();

            PokemonService pokeServ4 = container.getBean(PokemonService.class);
            PokemonService pokeServ5 = container.getBean(PokemonService.class);
            PokemonService pokeServ6 = container.getBean(PokemonService.class);

            pokeServ4.someMethod();


            System.out.println("==== Making stateful objects ====");
            Pokemon poke4 = container.getBean(Pokemon.class);
            Pokemon poke5 = container.getBean(Pokemon.class);
            Pokemon poke6 = container.getBean(Pokemon.class);

            System.out.println(poke4.getName());
            System.out.println(poke5.getName());
            System.out.println(poke6.getName());

            poke4.setName("Ditto");

            System.out.println(poke4.getName());
            System.out.println(poke5.getName());
            System.out.println(poke6.getName());

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
