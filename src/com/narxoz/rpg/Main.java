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

        HeroProfile hero = new HeroProfile("Lumine", 150);
        BossEnemy boss = new BossEnemy("Fatui Harbingers", 200, 20);

        AttackAction basicAttack = new BasicAttack("Sword Strike", 15);
        AttackAction fireAttack = new FireRuneDecorator(basicAttack);
       AttackAction poisonCritAttack = new PoisonCoatingDecorator(
                new CriticalFocusDecorator(basicAttack)
        );
        AttackAction ultimateAttack = new FireRuneDecorator(
                new PoisonCoatingDecorator(
                        new CriticalFocusDecorator(basicAttack)
                )
        );
        AttackAction enhanced = new FireRuneDecorator(
                new PoisonCoatingDecorator(
                        new CriticalFocusDecorator(basicAttack)
                )
            );

        System.out.println("--- Decorator Preview ---");
        System.out.println("[Base Action]");
        System.out.println("[Base Action]: " + basicAttack.getActionName() + " | Damage: " + basicAttack.getDamage());
        System.out.println("Base damage: " + basicAttack.getDamage());
        System.out.println("Base effects: " + basicAttack.getEffectSummary());
        System.out.println("[Combo A (Fire)]: " + fireAttack.getActionName() + " | Damage: " + fireAttack.getDamage());
        System.out.println("Combo (Poison + Crit): " + poisonCritAttack.getActionName());
        System.out.println("Damage: " + poisonCritAttack.getDamage());
        
        System.out.println("Ultimate (All modifiers): " + ultimateAttack.getActionName());
        System.out.println("Total Damage: " + ultimateAttack.getDamage());
        System.out.println("Effects: " + ultimateAttack.getEffectSummary());
        System.out.println("[Combo B (Full Stack)]: " + enhanced.getActionName() + " | Damage: " + enhanced.getDamage());
        System.out.println("Enhanced effects: " + enhanced.getEffectSummary());
        System.out.println();
        System.out.println("{Encreased Action with Fire Rune, Poison Coating, and Critical Focus}");
        System.out.println("Enhanced action name: " + enhanced.getActionName());
        System.out.println("Enhanced damage: " + enhanced.getDamage());
        System.out.println("Enhanced effects: " + enhanced.getEffectSummary());

        
        System.out.println("\n--- Facade Preview ---");
        DungeonFacade facade = new DungeonFacade().setRandomSeed(42L);
        AdventureResult result = facade.runAdventure(hero, boss, enhanced);

        System.out.println("\n===============================");
        System.out.println("       ADVENTURE SUMMARY       ");
        System.out.println("===============================");
        System.out.println("Winner: " + result.getWinner());
        System.out.println("Rounds: " + result.getRounds());
        System.out.println("Reward: " + result.getReward());
        System.out.println("\n--- Battle Log ---");
        for (String line : result.getLog()) {
            System.out.println(line);
        }

        System.out.println("\n=== Demo Complete ===");
    }
}
