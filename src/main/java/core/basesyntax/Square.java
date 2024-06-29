package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String print() {
        return "Figure: square, area: " + getArea() + " sq. units, side length: "
                + sideLength + " units, color: " + getColor();
    }
}
