# Homework 5: Detailed Assignment Instructions

## Background Story
The game studio is building a dungeon run mode. A hero can customize attacks with layered upgrades before entering battle, and the game team wants one simple entry point that hides the full preparation and reward flow.

Your job: implement **Decorator** and **Facade** cleanly.

---

## Part 1: Decorator Pattern - Runtime Attack Upgrades

### The Problem
The hero can enhance attacks with runes, coatings, buffs, and other effects. Creating one subclass for every combination does not scale.

### Your Tasks
1. Complete the `AttackAction` abstraction.
2. Implement `BasicAttack` as the concrete component.
3. Complete `ActionDecorator` as the shared wrapper.
4. Implement concrete decorators:
   - `FireRuneDecorator`
   - `PoisonCoatingDecorator`
   - `CriticalFocusDecorator`
5. Support stacking multiple decorators around one base attack.

### Required Outcomes
- Decorators must preserve the same public interface as the wrapped action.
- Students should be able to combine decorators in any order.
- Output should make the added behavior visible in the demo.

### Questions to Guide You
- What belongs in the base component, and what belongs in decorators?
- How should each decorator extend behavior without rewriting all logic?
- What changes when decorator order changes?

---

## Part 2: Facade Pattern - Simplified Dungeon Flow

### The Problem
A dungeon run involves multiple steps and subsystems. The main program should not manage every detail directly.

### Your Tasks
1. Complete `DungeonFacade` as the high-level entry point.
2. Define clear subsystem responsibilities for:
   - `PreparationService`
   - `BattleService`
   - `RewardService`
3. Use `AdventureResult` to return the final outcome.
4. Keep `Main.java` dependent on the facade for the dungeon workflow.

### Required Outcomes
- `DungeonFacade` should expose a simple method for running an adventure.
- The facade should delegate to subsystem classes instead of doing everything inline.
- `Main.java` should not orchestrate the low-level dungeon steps directly.

### Questions to Guide You
- What should the caller know, and what should stay hidden?
- Which responsibilities belong in the facade, and which belong in subsystems?
- How simple can the facade API be while still staying useful?

---

## Part 3: Integration

### Requirements
1. Build at least one hero and one boss enemy.
2. Create at least one base attack and multiple decorated versions.
3. Run a full dungeon scenario through the facade.
4. Print a readable summary of the run.

### Open Design Decisions
You must decide and document:
- how damage is calculated
- how battle rounds work
- how decorators affect action behavior
- how rewards are granted
- whether randomness is used and how determinism is handled

Your implementation must be internally consistent and pattern-correct.

---

## Part 4: Main Demo

Complete `Main.java` to demonstrate:
1. Base attack vs decorated attack
2. One action wrapped by multiple decorators
3. One full dungeon run through the facade
4. Clear winner, rounds, and reward output

---

## Part 5: UML Diagrams

Create two UML class diagrams:
1. Decorator diagram
2. Facade diagram

Diagrams must show:
- classes/interfaces
- inheritance/implementation
- key methods
- dependencies and associations

---

## Grading Rubric (Total: 100 points)

### Decorator Pattern (35 points)
- Correct component and decorator abstraction: 10
- Runtime stacking behavior: 15
- Clear proof of extension without subclass explosion: 10

### Facade Pattern (35 points)
- Clear facade API and responsibility split: 12
- Meaningful subsystem coordination: 13
- Main depends on facade appropriately: 10

### Integration + Demo (20 points)
- Full scenario works end-to-end: 10
- Demo clearly proves both patterns: 10

### UML + Code Quality (10 points)
- UML correctness: 5
- Naming, structure, readability: 5

---

## Common Pitfalls
- Hardcoding every possible attack combination in separate classes
- Letting `Main.java` call subsystem services directly for the dungeon flow
- Putting all dungeon logic inside the facade and leaving subsystems empty
- Making decorators break the shared interface contract

## Academic Integrity
You may discuss concepts and read references, but your implementation must be your own.
