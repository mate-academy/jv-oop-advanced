package core.basesyntax;

public abstract class Figure {
    String color;

    public Figure(String color) {
        this.color = color;
    }
    abstract double getArea();
    abstract void draw();
}
