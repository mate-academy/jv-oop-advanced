package core.basesyntax;

public abstract class Figure {
    String color;
    public Figure(String color) {
        this.color = color;
    }
    public abstract void draw();
    public abstract double getArea();
}