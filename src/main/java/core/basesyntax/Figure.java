package core.basesyntax;

public abstract class Figure implements Drawable {
    private Colors color;
    private double side;

    public Figure(Colors color, double side) {
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Colors getColor() {
        return color;
    }

    public abstract double getArea();
}
