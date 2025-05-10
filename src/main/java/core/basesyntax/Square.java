package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea() + " sq.units, side: "
                + getSideLength() + " color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

}
