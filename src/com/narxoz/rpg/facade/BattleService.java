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
        // TODO: Implement the battle flow.
        // Questions to answer:
        // - Who attacks first?
        // - How many rounds are allowed?
        // - How is damage resolved?
        // - How will randomness affect the result, if at all?
        AdventureResult result = new AdventureResult();
        result.setWinner("TODO");
        result.setRounds(0);
        result.setReward("TODO");
        result.addLine("TODO: implement battle logic");

        // Keep the field in use so students can decide whether to rely on it.
        if (random.nextInt(1) == 0) {
            // TODO: Replace placeholder branch with real deterministic or random logic.
        }

        return result;
    }
}
