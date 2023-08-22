package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int NUMBER_TWO = 2;
    private double sideLength;
    private double heightLength;

    public RightTriangle(double sideLength, double heightLength, String color) {
        this.sideLength = sideLength;
        this.heightLength = heightLength;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return (sideLength * heightLength) / NUMBER_TWO;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + (int) calculateArea()
                + " sq.units, sideLength: " + (int) sideLength + " units, heightLength: "
                + (int) heightLength + " units, color: " + getColor());
    }
}
