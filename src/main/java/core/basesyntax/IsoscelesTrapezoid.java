package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int NUMBER_TWO = 2;
    private double firstSideLength;
    private double secondSideLength;
    private double height;

    public IsoscelesTrapezoid(double height, double firstSideLength,
                              double secondSideLength, String color) {
        super(color);
        this.height = height;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    @Override
    public double calculateArea() {
        return (firstSideLength + secondSideLength) / NUMBER_TWO * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + (int) calculateArea()
                + " sq.units, firstSideLength: "
                + (int) firstSideLength + " units, secondSideLength: "
                + (int) secondSideLength + " units, heightLength: "
                + (int) height + " units, color: " + getColor());
    }
}
