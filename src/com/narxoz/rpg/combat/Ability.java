package com.narxoz.rpg.combat;

public abstract class Ability {
    protected final String name;
    protected final int power;
    
    protected Ability(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public abstract void use(Character target);

    public String getName() {
        return name;
    }
}
