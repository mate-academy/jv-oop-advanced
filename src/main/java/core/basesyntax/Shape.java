package core.basesyntax;

public abstract class Shape implements Figure {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
}
