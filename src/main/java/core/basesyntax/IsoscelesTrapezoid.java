package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperSide;
    private final double bottomSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperSide, double bottomSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upperSide + bottomSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid,"
                + " area: " + calculateArea()
                + " sq. units, bottom side: " + upperSide
                + " units, upper side: " + bottomSide
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
