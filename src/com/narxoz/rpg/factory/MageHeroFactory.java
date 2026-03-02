package com.narxoz.rpg.factory;

import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.hero.Mage;

public class MageHeroFactory implements HeroFactory {

    @Override
    public Hero createHero(String name) {
        return new Mage(name);
    }
}