package com.narxoz.rpg.adapter;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.character.Character;

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
        Character hero = (Character) ((HeroCombatantAdapter) target);
        enemy.attack(hero);
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