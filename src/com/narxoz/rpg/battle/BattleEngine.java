package com.narxoz.rpg.battle;

import com.narxoz.rpg.adapter.Combatant;

public class BattleEngine {

    private static final BattleEngine INSTANCE = new BattleEngine();

    private BattleEngine() {}

    public static BattleEngine getInstance() {
        return INSTANCE;
    }

    public void fight(Combatant a, Combatant b) {
        System.out.println("=== BATTLE START ===");

        while (a.isAlive() && b.isAlive()) {
            a.attack(b);
            if (b.isAlive()) {
                b.attack(a);
            }
        }

        Combatant winner = a.isAlive() ? a : b;
        System.out.println("Winner: " + winner.getName());
    }
}