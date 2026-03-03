package com.narxoz.rpg.enemy;



import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.prototype.CloneableEnemy;

import java.util.ArrayList;
import java.util.List;

public class BaseEnemy implements Enemy, CloneableEnemy {

    private String name;
    private int hp;
    private int damage;
    private LootTable lootTable;
    private List<Ability> abilities = new ArrayList<>();


    public BaseEnemy() {
    
    }
    public void setName(String name) { this.name = name; }
    public void setHp(int hp) { this.hp = hp; }
    public void setDamage(int damage) { this.damage = damage; }
    public void setLootTable(LootTable lootTable) { this.lootTable = lootTable; }
    public void setAbilities(List<Ability> abilities) { this.abilities = abilities; }



    @Override
    public void attack(Hero target) {
    target.takeDamage(damage);
    System.out.println(name + " attacks for " + damage);
}

    @Override
    public void takeDamage(int amount) {
        hp = Math.max(0, hp - amount);
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public Enemy cloneEnemy() {
        BaseEnemy copy = new BaseEnemy();
        copy.name = this.name;
        copy.hp = this.hp;
        copy.damage = this.damage;
        copy.lootTable = this.lootTable;
        copy.abilities = new ArrayList<>(this.abilities);
        return copy;
    }

 

    @Override public String getName() { return name; }
    @Override public int getHealth() { return hp; }
    @Override public int getDamage() { return damage; }
    @Override public List<Ability> getAbilities() { return abilities; }
    @Override public LootTable getLootTable() { return lootTable; }
}