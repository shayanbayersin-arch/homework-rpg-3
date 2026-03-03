package com.narxoz.rpg;

import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.adapter.*;
import com.narxoz.rpg.battle.BattleEngine;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== RPG Demo ===");

        HeroFactory heroFactory = new WarriorHeroFactory();
        Hero hero = heroFactory.createHero("Leonidas");

        EnemyDirector director = new EnemyDirector();
        Enemy enemy = director.createGoblin(new EnemyBuilder());

      
        Combatant heroUnit = new HeroCombatantAdapter(hero);
        Combatant enemyUnit = new EnemyCombatantAdapter(enemy);

    
        BattleEngine.getInstance().fight(heroUnit, enemyUnit);

     
        if (!enemy.isAlive()) {
            System.out.println("\nLoot dropped: " +
                    enemy.getLootTable().rollLoot());
        }

        System.out.println("\n=== Demo Complete ===");
    }
}