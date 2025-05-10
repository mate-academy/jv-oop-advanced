package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double middleLine;

    public IsoscelesTrapezoid(Color color, double topSide, double bottomSide, double middleLine) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.middleLine = middleLine;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * middleLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid "
                + ", Top Line: " + topSide
                + ", Bottom Line: " + bottomSide
                + ", color: " + getColor());
    }
}
