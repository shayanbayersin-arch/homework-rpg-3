package com.narxoz.rpg.factory;


import com.narxoz.rpg.hero.Hero;

public interface HeroFactory {
    Hero createHero(String name);
    
}
