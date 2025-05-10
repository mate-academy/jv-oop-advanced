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
        System.out.println("Square: side Length = "
                + sideLength
                + ", color = "
                + getColor()
                + ", area = "
                + getArea() + " sq.units.");
    }
}
