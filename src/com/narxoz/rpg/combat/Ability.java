package com.narxoz.rpg.combat;

import com.narxoz.rpg.hero.Hero;

public abstract class Ability {

    protected String name;
    protected int power;

    public Ability(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public abstract void use(Hero target);

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}