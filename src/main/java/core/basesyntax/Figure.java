package core.basesyntax;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract double area();

    abstract void draw();
}
