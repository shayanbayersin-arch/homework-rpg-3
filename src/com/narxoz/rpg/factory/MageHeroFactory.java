package com.narxoz.rpg.factory;

public  class MageHeroFactory implements HeroComponentFactory {
    @Override
    public String[] createAbilities() {
        return new String[] {"Fireball", "Teleport"};
    }

    @Override
    public String[] createWeapon() {
        return new String[] {"Staff", "Wand"};
    }
    
}
