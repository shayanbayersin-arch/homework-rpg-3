package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.loot.SimpleLootTable;

import java.util.List;

public class EnemyDirector {

    public Enemy createGoblin(EnemyBuilder builder) {
        return builder
                .name("Goblin")
                .hp(80)
                .damage(12)
                .loot(new SimpleLootTable(List.of("Gold", "Dagger")))
                .build();
    }
}