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
    public double getArea() {
        return ((bottomSide + upperSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid," + " area: "
                + getArea() + " sq. units, bottom side: "
                + bottomSide + " units, upper side: "
                + upperSide + " units, height: "
                + height + " units, color: " + super.getColor());
    }
}
