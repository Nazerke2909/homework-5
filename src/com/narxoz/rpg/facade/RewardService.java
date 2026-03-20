package com.narxoz.rpg.facade;

public class RewardService {
    public String determineReward(AdventureResult battleResult) {
        if (battleResult == null || battleResult.getWinner() == null) {
            return "No reward (Battle result is incomplete or invalid)";
        }

        int rounds = battleResult.getRounds();
        if (rounds <= 5) {
            return "Legendary Chest (For an incredibly fast victory!)";
        } else if (rounds < 15) {
            return "Silver Chest and 300 Gold";
        } else {
            return "Rusty Sword and Healing Potion (Hard-fought battle)";
        }
    }
}
