package core.basesyntax;

public abstract class Figure {
    String color;
    double area;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();
}
