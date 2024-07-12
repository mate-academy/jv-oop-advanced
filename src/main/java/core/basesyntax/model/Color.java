package core.basesyntax.model;

public abstract class Color implements Figure, Draw {
    protected String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
