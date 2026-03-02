package com.narxoz.rpg;

import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.builder.EnemyBuilder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.loot.SimpleLootTable;
import com.narxoz.rpg.adapter.*;
import com.narxoz.rpg.battle.BattleEngine;

import java.util.List;

public class Main {

    public static void main(String[] args) {

   
        HeroFactory heroFactory = new WarriorFactory();
        Hero hero = heroFactory.createHero("Arthur");

        Enemy enemy = new EnemyBuilder()
                .name("Fire Goblin")
                .hp(90)
                .damage(15)
                .loot(new SimpleLootTable(List.of("Gold", "Sword", "Potion")))
                .build();

    
        Combatant heroUnit = new HeroCombatantAdapter(hero);
        Combatant enemyUnit = new EnemyCombatantAdapter(enemy);

        
        BattleEngine.getInstance().fight(heroUnit, enemyUnit);

      
        if (!enemy.isAlive()) {
            System.out.println("Loot dropped: " +
                    enemy.getLootTable().rollLoot());
        }
    }
}