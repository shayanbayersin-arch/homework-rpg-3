package com.narxoz.rpg.battle;

import com.narxoz.rpg.adapter.Combatant;

public class BattleEngine {

    private static final BattleEngine INSTANCE = new BattleEngine();
    private static final int MAX_ROUNDS = 20;

    private BattleEngine() {}

    public static BattleEngine getInstance() {
        return INSTANCE;
    }

    public void fight(Combatant a, Combatant b) {
        System.out.println("=== BATTLE START ===");

        int round = 1;

        while (a.isAlive() && b.isAlive() && round <= MAX_ROUNDS) {
            System.out.println("\n--- Round " + round + " ---");

            a.attack(b);

            if (b.isAlive()) {
                b.attack(a);
            }

            round++;
        }

        System.out.println("\n=== BATTLE END ===");

        Combatant winner = a.isAlive() ? a : b;
        System.out.println("Winner: " + winner.getName());
    }
}