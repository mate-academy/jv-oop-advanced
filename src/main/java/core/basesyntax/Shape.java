package core.basesyntax;

public abstract class Shape implements Figure, Drawable {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    public abstract void draw();
}
