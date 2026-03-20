package com.narxoz.rpg.hero;

public class HeroProfile {
    private final String name;
    private int health;

    public HeroProfile(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int amount) {
        // TODO: Decide how health should be reduced and clamped.
        health -= amount;
    }

    public boolean isAlive() {
        // TODO: Decide whether additional conditions belong here.
        return health > 0;
    }
}
