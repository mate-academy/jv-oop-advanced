package core.basesyntax;

public abstract class Figure implements Draw {
    private Colors color;

    Figure(Colors color) {
        this.color = color;
    }

    public abstract double getArea();

    public Colors getColor() {
        return color;
    }
}
