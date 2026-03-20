package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.hero.HeroProfile;

public class PreparationService {
    public String prepare(HeroProfile hero, BossEnemy boss, AttackAction action) {
        // TODO: Validate inputs and return a useful preparation summary.
        // You may also decide to initialize temporary state here.
        if (hero == null || boss == null || action == null) {
            return "TODO: invalid preparation state";
        }
        return "TODO: preparation complete";
    }
}
