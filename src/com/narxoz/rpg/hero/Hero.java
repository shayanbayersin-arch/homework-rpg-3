package com.narxoz.rpg.hero;

import com.narxoz.rpg.enemy.Enemy;

public interface Hero {
    String getName();
    int getPower();
    void attack(Enemy enemy); 
    void takeDamage(int amount); 
    boolean isAlive();
}