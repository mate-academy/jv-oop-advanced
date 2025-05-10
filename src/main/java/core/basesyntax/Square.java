package core.basesyntax;

public class Square extends Figure {
    private final double sideLength;

    public Square(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                +
                sideLength + " units, color: " + getColor());
    }
}
