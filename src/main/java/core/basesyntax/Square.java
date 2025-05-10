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
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea() + " sq. units, sideLength: " + sideLength + ", color: " + getColor());
    }
}
