package com.narxoz.rpg.decorator;

public abstract class ActionDecorator implements AttackAction {
    private final AttackAction wrappedAction;

    protected ActionDecorator(AttackAction wrappedAction) {
        this.wrappedAction = wrappedAction;
    }

    protected AttackAction getWrappedAction() {
        return wrappedAction;
    }

    @Override
    public String getActionName() {
        // TODO: Delegate to wrapped action, then extend if needed.
        return wrappedAction.getActionName();
    }

    @Override
    public int getDamage() {
        // TODO: Delegate to wrapped action, then extend if needed.
        return wrappedAction.getDamage();
    }

    @Override
    public String getEffectSummary() {
        // TODO: Delegate to wrapped action, then extend if needed.
        return wrappedAction.getEffectSummary();
    }
}
