package com.narxoz.rpg.combat;

import com.narxoz.rpg.hero.Hero;

public class FireBall extends Ability {

    public FireBall() {
        super("Fireball", 30);
    }

    @Override
    public void use(Hero target) {
        target.takeDamage(this.power);
        System.out.println("Fireball hits for " + power);
    }
}