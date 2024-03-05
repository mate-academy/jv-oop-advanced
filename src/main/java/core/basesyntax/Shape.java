package core.basesyntax;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
    public abstract double calculateArea();
}
