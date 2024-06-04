package core.basesyntax;

abstract class Figure {
    private final String color;

    public String getColor() {
        return color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}
