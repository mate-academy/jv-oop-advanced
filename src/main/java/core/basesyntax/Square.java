package core.basesyntax;

public class Square extends Figure {
    private final double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square: color = " + getColor() + ", sideLength = " + sideLength;
    }
}