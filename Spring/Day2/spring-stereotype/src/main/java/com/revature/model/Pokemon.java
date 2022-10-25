package com.revature.model;

import org.springframework.stereotype.Component;

@Component
public class Pokemon {
    private String name;
    private int level;
    private int health;
    
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
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    
}
