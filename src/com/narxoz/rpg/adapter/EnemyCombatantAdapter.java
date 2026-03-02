package com.narxoz.rpg.adapter;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.hero.Hero;
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
    @Override
    public void attack(Combatant target) {
    if (target instanceof HeroCombatantAdapter heroAdapter) {
        enemy.attack(heroAdapter.getHero());
     }
   }    
   public Hero getHero() {
    return hero;
}
}