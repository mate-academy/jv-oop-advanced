package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topLength;
    private final double bottomLength;
    private final double heightLength;

    public IsoscelesTrapezoid(String color, double topLength, double bottomLength,
                              double heightLength) {
        super(color);
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        this.heightLength = heightLength;
    }

    @Override
    public double calculateArea() {
        return (bottomLength + topLength) / 2 * heightLength;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Isosceles Trapezoid, area = %.3f sq.units,"
                        + " top length = %.3f units, bottom length = %.3f units,"
                        + " height length = %.3f units, color - %s\n",
                        calculateArea(), topLength, bottomLength, heightLength, getColor());
    }
}
