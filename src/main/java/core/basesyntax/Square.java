package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, int sideLength) {
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
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq.units, sideLength: "
                + getSideLength() + " units, color: "
                + getColor());
    }
}
