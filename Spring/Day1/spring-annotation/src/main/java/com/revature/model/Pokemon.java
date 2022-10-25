package com.revature.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //Set the bean scope to prototype
public class Pokemon {

    @Value("Pikachu") //Gives a default value of the name
    private String name;
    private int level;
    private int health;

    public Pokemon() {
        System.out.println("Creating object out of "+Pokemon.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name +" Setter was used";
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    
}
