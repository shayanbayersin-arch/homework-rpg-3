package com.narxoz.rpg.combat;

public class IceSpike extends Ability {
    public IceSpike() {
        super("Ice Spike", 15);
    }
    @Override
    public void use(Character target) {
        target.takeDamage(this.power);
        System.out.println(power);
    }
    
}
