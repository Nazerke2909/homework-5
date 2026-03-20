package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.hero.HeroProfile;

public class DungeonFacade {
    private final PreparationService preparationService = new PreparationService();
    private final BattleService battleService = new BattleService();
    private final RewardService rewardService = new RewardService();

    public DungeonFacade setRandomSeed(long seed) {
        battleService.setRandomSeed(seed);
        return this;
    }

    public AdventureResult runAdventure(HeroProfile hero, BossEnemy boss, AttackAction action) {
        // TODO: Coordinate subsystem calls in a clean order.
        // Suggested flow:
        // 1) preparation
        // 2) battle
        // 3) reward
        AdventureResult result = battleService.battle(hero, boss, action);
        String preparationSummary = preparationService.prepare(hero, boss, action);
        result.addLine(preparationSummary);
        result.setReward(rewardService.determineReward(result));
        return result;
    }
}
