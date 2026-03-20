# Quick Start Guide

## Prerequisites
- Java 17 or higher
- Any Java IDE

## Setup
1. Open `homework-rpg-5` in your IDE.
2. Mark `src` as Sources Root if needed.
3. Read files in this order:
   - `README.md`
   - `ASSIGNMENT.md`
   - `src/com/narxoz/rpg/hints/DECORATOR_HINTS.md`
   - `src/com/narxoz/rpg/hints/FACADE_HINTS.md`

## Compile and Run
```powershell
cd homework-rpg-5
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
java -cp out com.narxoz.rpg.Main
```

## Recommended Implementation Order
1. Read all TODOs first.
2. Complete the Decorator interfaces and wrappers.
3. Decide how attack upgrades modify behavior.
4. Complete facade and subsystem responsibilities.
5. Decide battle, reward, and summary rules.
6. Finalize `Main.java` to prove both patterns.

## Success Criteria
- Project compiles without errors.
- Demo makes Decorator and Facade explicit.
- Your own design decisions are consistent and justified.
