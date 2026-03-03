package com.narxoz.rpg.enemy;

import com.narxoz.rpg.loot.LootTable;

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

    public void setName(String name) {
         this.name = name; }
    public void setHp(int hp) { this.health = hp; }
    public void setDamage(int damage) { this.damage = damage; }
    public void setLootTable(LootTable loot) { this.lootTable = loot; }

}