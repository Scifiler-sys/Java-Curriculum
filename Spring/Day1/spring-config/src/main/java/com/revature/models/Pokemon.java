package com.revature.models;

public class Pokemon {
    
    private int Id;
    private String name;
    private int level;
    private int health;
    private int damage;

    public Pokemon() {
        System.out.println("Pokemon Model object was created!");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Pokemon [Id=" + Id + ", damage=" + damage + ", health=" + health + ", level=" + level + ", name=" + name
                + "]";
    }

    
}
