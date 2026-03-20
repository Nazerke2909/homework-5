# Facade Pattern Hints

## Goal
Provide one simple entry point for a dungeon run while hiding subsystem complexity.

## Suggested Roles
- `DungeonFacade`: high-level workflow entry point
- `PreparationService`: setup and validation
- `BattleService`: combat rules and simulation
- `RewardService`: post-battle reward logic
- `AdventureResult`: result object returned to the caller

## Core Idea
The caller should interact with the facade for the dungeon workflow instead of coordinating every subsystem directly.

## Design Prompts
- What should `Main.java` know about the internal workflow?
- What information must the facade collect and return?
- Which steps belong in services, and which belong in the facade?
- How will you keep the facade simple without turning subsystems into empty shells?

## What To Avoid
- Calling all services directly from `Main.java`
- Putting every low-level detail into the facade
- Creating subsystems that do nothing meaningful

## Check Yourself
- Can one method on the facade run the whole scenario?
- Does the facade hide complexity instead of exposing it?
- Are subsystem responsibilities clearly separated?
