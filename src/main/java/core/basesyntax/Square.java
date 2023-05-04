package core.basesyntax;

public class Square extends Figure {
    private final Color color;
    private final double sideLength;

    public Square(Color color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side length: " + sideLength
                + " units, color: " + color);
    }
}
