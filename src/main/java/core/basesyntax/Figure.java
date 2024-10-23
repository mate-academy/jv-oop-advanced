package core.basesyntax;

public abstract class Figure {
    public String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract void draw();
}
