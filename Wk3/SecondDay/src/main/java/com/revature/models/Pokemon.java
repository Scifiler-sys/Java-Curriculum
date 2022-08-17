package com.revature.models;

import java.util.function.Predicate;

import com.revature.utils.functionalInterface;
import com.revature.utils.functionalInterface2;
import com.revature.utils.functionalInterface3;

public class Pokemon {
    private String name;
    private int level;
    
    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void doFunction(functionalInterface function){
        
        System.out.println("do function running");

        //You can think of functional interface as a placeholder for the future function that you will create and then execute them
        function.hello();
    }

    public void doFunction2(functionalInterface2 function){
        //You can have functional interfaces that returns some datatype and then you can use it as well
        System.out.println("do Function2 " + function.hello2());
    }

    public void doFunction3(functionalInterface3 function){
        //You can have functional interfaces that have parameters that you can use in your lambda expression
        function.hello3("Hello World");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
