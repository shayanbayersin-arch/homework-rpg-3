package com.narxoz.rpg.combat;



public class FireBall extends Ability {
    public FireBall() {
        super("Fireball", 30);
    }
    @Override
    public void use(Character target) {
        target.takeDamage(this.power);
        System.out.println(power);
    }
}
