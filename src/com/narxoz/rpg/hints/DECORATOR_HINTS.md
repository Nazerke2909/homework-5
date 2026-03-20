# Decorator Pattern Hints

## Goal
Add behavior to an attack object at runtime without changing the object interface.

## Mapping
- Component: `AttackAction`
- Concrete Component: `BasicAttack`
- Base Decorator: `ActionDecorator`
- Concrete Decorators:
  - `FireRuneDecorator`
  - `PoisonCoatingDecorator`
  - `CriticalFocusDecorator`

## Core Idea
Every decorator should wrap another `AttackAction` and still behave like an `AttackAction`.

## Design Prompts
- Which methods should delegate first and extend second?
- How will you combine effect descriptions cleanly?
- Should decorator order matter in your design?
- How will your demo prove runtime stacking clearly?

## What To Avoid
- Creating one class per exact attack combination
- Copy-pasting full behavior into every decorator
- Breaking the component contract

## Check Yourself
- Can you wrap a decorated action with another decorator?
- Does client code still work with the `AttackAction` type only?
- Do your decorators add behavior instead of replacing the pattern structure?
