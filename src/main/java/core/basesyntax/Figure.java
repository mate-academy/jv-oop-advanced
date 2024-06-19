package core.basesyntax;

public abstract class Figure implements Draw {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String getColor();
}
