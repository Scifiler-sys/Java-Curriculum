package com.revature.models;

public class Pokemon {
    private String name;
    private int level;
    private int health;
    private int damage;

    public Pokemon() { }

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
        return "Pokemon [damage=" + damage + ", health=" + health + ", level=" + level + ", name=" + name + "]";
    }
}
