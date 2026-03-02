package com.narxoz.rpg.factory;

public class WarriorHeroFactory implements HeroComponentFactory {
    @Override
    public String[] createAbilities() {
        return new String[] {"Slash", "Shield Block", "War Cry"};
    }

    @Override
    public String[] createWeapon() {
        return new String[] {"Sword", "Axe"};
    }
    
}
