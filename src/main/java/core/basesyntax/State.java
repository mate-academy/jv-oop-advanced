package core.basesyntax;

public abstract class State implements Figure {
    private String color;

    protected State(String color) {
        this.color = color;
    }
}
