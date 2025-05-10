package core.basesyntax;

public abstract class Figure implements Draw {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double getArea();
}
