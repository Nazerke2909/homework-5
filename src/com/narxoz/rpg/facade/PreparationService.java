package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.hero.HeroProfile;

public class PreparationService {
    public String prepare(HeroProfile hero, BossEnemy boss, AttackAction action) {
        if (hero == null || boss == null || action == null) {
            return "Error: Hero, Boss, and Action must all be selected before preparation.";
        }
        return String.format("Preparation complete! Hero: %s (Health: %d), Boss: %s (Health: %d), Action: %s",
                hero.getName(), hero.getHealth(), boss.getName(), boss.getHealth(), action.getActionName());
    }
}
