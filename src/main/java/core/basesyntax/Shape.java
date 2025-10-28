package core.basesyntax;

public abstract class Shape implements Figure,Drawable {
    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
