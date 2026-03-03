package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.BaseEnemy;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.loot.LootTable;

public class EnemyBuilder {

    private final BaseEnemy enemy = new BaseEnemy();
    public void setName(String name) {
         this.name = name; 
        }
    public void setHp(int hp) {
         this.health = hp; 
        }
    public void setDamage(int damage) {
         this.damage = damage; 
        }

    public EnemyBuilder name(String name) {
        enemy.setName(name);
        return this;
    }

    public EnemyBuilder hp(int hp) {
        enemy.setHp(hp);
        return this;
    }

    public EnemyBuilder damage(int damage) {
        enemy.setDamage(damage);
        return this;
    }

    public EnemyBuilder loot(LootTable loot) {
        enemy.setLootTable(loot);
        return this;
    }

    public Enemy build() {
        return enemy;
    }
}