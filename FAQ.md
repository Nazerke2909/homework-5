# FAQ

## 1) Is this project intentionally incomplete?
Yes. This assignment is designed to leave most implementation work to you.

## 2) Do all students need identical gameplay rules?
No. Multiple valid implementations are acceptable if they are consistent and respect the required patterns.

## 3) Must decorators only increase damage?
No. They may also change naming, summaries, side effects, logging, or other behavior, as long as the shared contract stays clear.

## 4) Why not just create one class per attack combination?
That approach does not scale well. Decorator is meant to avoid combination explosion.

## 5) Should `Main.java` call `PreparationService`, `BattleService`, and `RewardService` directly?
No. The dungeon workflow should be presented through the facade.

## 6) Can the facade contain some logic too?
Yes, but it should primarily coordinate subsystems instead of replacing them entirely.

## 7) Do I need randomness?
That is your design choice. If you use randomness, consider whether deterministic behavior should be supported.

## 8) What should the demo prove?
It should clearly prove:
- runtime decorator stacking
- one simple facade-driven dungeon run
- readable summary output
