package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(12);
        intList.add(89);
        intList.add(60);

        //Unbound has no problem using Integer
        listElement(intList);

        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("World");

        //Unbound has no problem using String
        listElement(stringList);

        //Bounded has no problem with Integer
        System.out.println(add(intList));
        // System.out.println(add(stringList)); //Has problems with Strings since we bounded it only for Numbers

        List<Animal> animalList = new ArrayList<Animal>();
        
        addOnlyCat(animalList);

    }

    //Example of Unbounded wildcards
    public static void listElement(List<?> list){
        for (Object object : list) {
            System.out.println(object);
        }
    }

    //Examples of Bounded wildcards

    //Anything that uses extend keyword
    //Will sum every number in an ArrayList. However, this will only work with a List that have numbers!
    //What if we don't care what numerical datatype such as int, float, double, etc. but it has to be numerical how?
    //This is specifically an upper bound wildcard
    //Useful if you need only "read" access
    public static double add(List<? extends Number> list) {

        //Using double since double works nicely with most numerical datatypes
        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }

    //Example of lower bound wildcard
    //Useful if you need only "write" access
    public static void addOnlyCat(List<? super Animal> list){
       list.add(new Cat());

    }

    /**
     * In a more detailed note, lower and upperbound wildcards will determine the "type safety" of the argument hence why we can do certain things if you use upper bound
     * but cannot do other things that only lower bound can do. The compiler will dictate it so.
     * 
     * So a nicer rule of thumb to help you determine which one to use is. Upper is for read only and lower is for write only.
     * 
     * What if you want to do both read and write? Use generics T and not wildcards
     */

    static class Animal {
    
    }

    static class Cat extends Animal{

        @Override
        public String toString() {
            return "Cat Meow! Meow!";
        }
        
    }
}
