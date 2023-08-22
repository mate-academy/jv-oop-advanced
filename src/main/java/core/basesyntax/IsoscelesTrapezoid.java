package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int NUMBER_TWO = 2;
    private double firstSideLength;
    private double secondSideLength;
    private double heightLength;

    public IsoscelesTrapezoid(double heightLength, double firstSideLength,
                              double secondSideLength, String color) {
        this.heightLength = heightLength;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;

        setColor(color);
    }

    @Override
    public double calculateArea() {
        return (firstSideLength + secondSideLength) / NUMBER_TWO * heightLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + (int) calculateArea()
                + " sq.units, firstSideLength: "
                + (int) firstSideLength + " units, secondSideLength: "
                + (int) secondSideLength + " units, heightLength: "
                + (int) heightLength + " units, color: " + getColor());
    }
}
