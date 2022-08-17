package com.revature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import com.revature.models.Pokemon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pokemon p1 = new Pokemon("Pikachu", 1);

        //the Lamdba expression MUST follow the method signature of that one abstract method in your functional interface
        p1.doFunction(() -> System.out.println("Pikaachuuuu"));

        //Multi-line Lamdba expression
        p1.doFunction(() -> {
            System.out.println("Pika");
            System.out.println("Chuuuuuu");
        });

        //Returning abstract methods needs the {}
        p1.doFunction2(() -> {return "Hello";});

        //Just a more possible complex function
        p1.doFunction2(() -> {
            String test = "";
            test += "Hello ";
            test += " World";

            return test;
        });

        //Functional interface that needs a parameter
        p1.doFunction3((str) -> {
            System.out.println(str);
        });

        System.out.println("===Testing a functional interface used by Java===");
        List<String> pokeNames = new ArrayList<>();
        pokeNames.add("Marielle");
        pokeNames.add("Stephen");
        pokeNames.add("Donato");

        pokeNames.forEach((elements) -> {
            System.out.println(elements);
        });

        System.out.println("===Foreach way===");
        for (String elements : pokeNames) {
            System.out.println(elements);
        }

        //Storing a function in a variable like JS by using pre-made/custom functional interface
        System.out.println("==Storing a function in a method==");
        Consumer<String> displayPls = (someString) -> System.out.println(someString);

        displayPls.accept("Hello");
        displayPls.accept("World");
        

    }
}
