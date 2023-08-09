package core.basesyntax;

public abstract class Figure implements Draw {
    private String color;
    private double square;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double getArea();
}
