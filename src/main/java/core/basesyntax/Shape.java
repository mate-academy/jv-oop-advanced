package core.basesyntax;

public abstract class Shape implements Figure {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();
}
