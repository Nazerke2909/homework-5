package com.narxoz.rpg.enemy;

public class BossEnemy {
    private final String name;
    private int health;
    private final int attackPower;

    public BossEnemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int amount) {
        // TODO: Decide how boss damage should be applied and clamped.
        health -= amount;
    }

    public boolean isAlive() {
        // TODO: Decide whether additional boss states belong here.
        return health > 0;
    }
}
