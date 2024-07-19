package core.basesyntax.model;

public abstract class Color implements Draw, Figure {
    protected String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
