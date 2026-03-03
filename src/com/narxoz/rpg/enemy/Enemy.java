package com.narxoz.rpg.enemy;

import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;

public interface Enemy {

    void attack(Hero target); // ← ВАЖНО

    void takeDamage(int amount);
    boolean isAlive();

    String getName();
    int getHealth();
    int getDamage();

    List<Ability> getAbilities();
    LootTable getLootTable();
}