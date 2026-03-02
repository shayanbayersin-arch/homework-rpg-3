package com.narxoz.rpg.factory;

import com.narxoz.rpg.hero.Hero;
import com.narxoz.rpg.hero.Warrior;

public class WarriorHeroFactory implements HeroFactory {

    @Override
    public Hero createHero(String name) {
        return new Warrior(name);
    }
}