package com.narxoz.rpg.enemy;

import com.narxoz.rpg.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.hero.Hero;

public class BaseEnemy implements Enemy {
    protected String name;
    protected int health;
    protected int damage;
    protected LootTable lootTable;

    public BaseEnemy() {}

    public BaseEnemy(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

   
    public void setName(String name) { this.name = name; }
    public void setHp(int hp) { this.health = hp; }
    public void setDamage(int damage) { this.damage = damage; }
    public void setLootTable(LootTable loot) { this.lootTable = loot; }

  
    @Override
    public String getName() { return name; }

    @Override
    public int getHealth() { return health; }

    @Override
    public void takeDamage(int amount) {
        this.health = Math.max(0, this.health - amount);
    }

    @Override
    public void attack(Hero hero) {
        hero.takeDamage(this.damage);
        System.out.println(name + " attacks " + hero.getName() + " for " + damage + " damage!");
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

     @Override
    public List<Ability> getAbilities() {
        return new ArrayList<>();
    }

    @Override
    public int getSpeed() {
        return 0; 
    }

    @Override
    public int getDefense() {
        return 0; 
    }

    @Override
    public int getDamage() {
        return this.damage; 
    }

    @Override
    public LootTable getLootTable() {
        return this.lootTable;
    }

    @Override
    public void displayInfo() {
        System.out.println("Enemy: " + name + " | HP: " + health);
    }

    @Override
    public Enemy cloneEnemy() {
        return new BaseEnemy(this.name, this.damage, this.health);
    }
}