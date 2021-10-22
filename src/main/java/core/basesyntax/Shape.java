package core.basesyntax;

public abstract class Shape implements AreaCounter, Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
