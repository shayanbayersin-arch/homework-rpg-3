package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.prototype.CloneableEnemy;

import java.util.List;

public interface Enemy extends CloneableEnemy {

    String getName();
    int getHealth();
    int getDamage();
    int getDefense();
    int getSpeed();

    List<Ability> getAbilities();
    LootTable getLootTable();

    void attack(Hero target);
    void takeDamage(int amount);
    boolean isAlive();
    void displayInfo();
}