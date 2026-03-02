package com.narxoz.rpg.enemy;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;

public interface Enemy {

    void attack(Character target);
    void takeDamage(int amount);
    boolean isAlive();

    String getName();
    int getHealth();
    int getDamage();

    List<Ability> getAbilities();
    LootTable getLootTable();
}