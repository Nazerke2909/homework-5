package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.hero.HeroProfile;

import java.util.Random;

public class BattleService {
    private Random random = new Random(1L);

    public BattleService setRandomSeed(long seed) {
        this.random = new Random(seed);
        return this;
    }

    public AdventureResult battle(HeroProfile hero, BossEnemy boss, AttackAction action) {
        AdventureResult result = new AdventureResult();
        int roundCount = 0;

        result.addLine("Battle starts!" + hero.getName() + "uses" + action.getActionName());
        while (hero.isAlive() && boss.isAlive() && roundCount < 20) {
            roundCount++;
            result.addLine("--- Round " + roundCount + " ---");

            if (random.nextBoolean()) {
                performHeroTurn(hero, boss, action, result);
                if (boss.isAlive()) {
                    performBossTurn(hero, boss, result);
                }
            } else {
                performBossTurn(hero, boss, result);
                if (hero.isAlive()) {
                    performHeroTurn(hero, boss, action, result);
                }
            }
        }
        
        result.setRounds(roundCount);
        result.setWinner(hero.isAlive() ? hero.getName() : boss.getName());
        return result;
    }
        private void performHeroTurn(HeroProfile hero, BossEnemy boss, AttackAction action, AdventureResult result) {
        int damage = action.getDamage();
        boss.takeDamage(damage);
        result.addLine(hero.getName() + " attacks for " + damage + " damage (Effects: " + action.getEffectSummary() + ")");
    }

    private void performBossTurn(HeroProfile hero, BossEnemy boss, AdventureResult result) {
        int damage = boss.getAttackPower();
        hero.takeDamage(damage);
        result.addLine(boss.getName() + " attacks for " + damage + " damage.");
    }
}
