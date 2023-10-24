package core.basesyntax.figures.behaviour;

import core.basesyntax.figures.behaviour.Figure;

public abstract class State implements Figure {
    protected String color;

    public State(String color) {
        this.color = color;
    }
}
