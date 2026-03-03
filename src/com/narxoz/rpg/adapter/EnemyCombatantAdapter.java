package com.narxoz.rpg.adapter;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyCombatantAdapter implements Combatant {

    private final Enemy enemy;

    public EnemyCombatantAdapter(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    @Override
    public void attack(Combatant target) {
        if (target instanceof HeroCombatantAdapter heroAdapter) {
            enemy.attack(heroAdapter.getHero());
        }
    }

    @Override
    public void takeDamage(int damage) {
        enemy.takeDamage(damage);
    }

    @Override
    public boolean isAlive() {
        return enemy.isAlive();
    }

    @Override
    public String getName() {
        return enemy.getName();
    }
}