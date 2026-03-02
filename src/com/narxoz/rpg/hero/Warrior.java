package com.narxoz.rpg.hero;

import com.narxoz.rpg.enemy.Enemy;

public class Warrior implements Hero {
    private final String name;
    private final int power;
    private int health;

    public Warrior(String name) {
        this.name = name;
        // TODO: tune stats if needed
        this.power = 20;
        this.health = 120;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void receiveDamage(int amount) {
       
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }
    @Override
    public void attack(Enemy enemy) {
    enemy.takeDamage(power);
    System.out.println(name + " casts spell for " + power);
}

    @Override
    public void takeDamage(int amount) {
    health = Math.max(0, health - amount);
   }
}
