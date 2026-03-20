package com.narxoz.rpg;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.decorator.BasicAttack;
import com.narxoz.rpg.decorator.CriticalFocusDecorator;
import com.narxoz.rpg.decorator.FireRuneDecorator;
import com.narxoz.rpg.decorator.PoisonCoatingDecorator;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.facade.AdventureResult;
import com.narxoz.rpg.facade.DungeonFacade;
import com.narxoz.rpg.hero.HeroProfile;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Homework 5 Demo: Decorator + Facade ===\n");

        // TODO: Create a hero and a boss with your own meaningful stats.
        HeroProfile hero = new HeroProfile("TODO Hero", 100);
        BossEnemy boss = new BossEnemy("TODO Boss", 120, 15);

        // TODO: Start with a base action and then create several decorated versions.
        AttackAction basic = new BasicAttack("Strike", 10);
        AttackAction enhanced = new FireRuneDecorator(
                new PoisonCoatingDecorator(
                        new CriticalFocusDecorator(basic)
                )
        );

        System.out.println("--- Decorator Preview ---");
        System.out.println("Base action: " + basic.getActionName());
        System.out.println("Base damage: " + basic.getDamage());
        System.out.println("Base effects: " + basic.getEffectSummary());
        System.out.println();
        System.out.println("Enhanced action: " + enhanced.getActionName());
        System.out.println("Enhanced damage: " + enhanced.getDamage());
        System.out.println("Enhanced effects: " + enhanced.getEffectSummary());

        // TODO: Replace the placeholder preview above with richer proof of runtime composition.

        System.out.println("\n--- Facade Preview ---");
        DungeonFacade facade = new DungeonFacade().setRandomSeed(42L);
        AdventureResult result = facade.runAdventure(hero, boss, enhanced);

        System.out.println("Winner: " + result.getWinner());
        System.out.println("Rounds: " + result.getRounds());
        System.out.println("Reward: " + result.getReward());
        for (String line : result.getLog()) {
            System.out.println(line);
        }

        // TODO: Expand this demo so it clearly proves:
        // 1) multiple decorator combinations
        // 2) one full dungeon run through the facade
        // 3) readable final summary

        System.out.println("\n=== Demo Complete ===");
    }
}
