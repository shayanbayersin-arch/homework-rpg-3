package com.narxoz.rpg.adapter;

import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.enemy.Enemy;

public class HeroCombatantAdapter implements Combatant {

    private final Hero hero;

    public HeroCombatantAdapter(Hero hero) {
        this.hero = hero;
    }
    @Override
    public void attack(Combatant target) {
        Enemy enemy = ((EnemyCombatantAdapter) target).getEnemy();
        hero.attack(enemy);
    }
    @Override
    public void takeDamage(int damage) {
        hero.takeDamage(damage);
    }
    @Override
    public boolean isAlive() {
        return hero.isAlive();
    }
    @Override
    public String getName() {
        return hero.getName();
    }
}