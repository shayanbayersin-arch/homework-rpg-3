package com.narxoz.rpg.combat;

import com.narxoz.rpg.hero.Hero;

public class IceSpike extends Ability {

    public IceSpike() {
        super("Ice Spike", 15);
    }

    @Override
    public void use(Hero target) {
        target.takeDamage(this.power);
        System.out.println("Ice Spike hits for " + power);
    }
}