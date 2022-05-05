package core.basesyntax;

public abstract class Figure {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public abstract double getArea();

    public Colors getColor() {
        return color;
    }
}
