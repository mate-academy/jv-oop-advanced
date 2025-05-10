package core.basesyntax;

public abstract class Figure {
    private String color;

    public String getColor() {
        return color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract void draw();
}
