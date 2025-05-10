package core.basesyntax;

public abstract class Figure {
    private final String color;
    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "Figure with color: " + color;
    }
}
