package com.narxoz.rpg.loot;

import java.util.List;
import java.util.Random;

public class SimpleLootTable extends LootTable {

    private final List<String> items;
    private final Random random = new Random();

    public SimpleLootTable(List<String> items) {
        this.items = items;
    }

    @Override
    public String rollLoot() {
        if (items == null || items.isEmpty()) {
            return "Nothing";
        }
        return items.get(random.nextInt(items.size()));
    }
}