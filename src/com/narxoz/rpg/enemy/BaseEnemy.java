package com.narxoz.rpg.enemy;

import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;

public abstract class BaseEnemy implements Enemy {

    protected String name;
    protected int damage;
    protected int health;

    public BaseEnemy(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public void attack(Hero target) {
        target.takeDamage(damage);
        System.out.println(name + " attacks for " + damage);
    }

    @Override
    public void takeDamage(int amount) {
        health = Math.max(0, health - amount);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override public int getDefense() { return 0; }
    @Override public int getSpeed() { return 0; }
    @Override public List<Ability> getAbilities() { return List.of(); }
    @Override public LootTable getLootTable() { return null; }
    @Override public void displayInfo() {}
}