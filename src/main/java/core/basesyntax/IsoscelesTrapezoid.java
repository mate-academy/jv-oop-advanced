package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double baseSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upperSide, double baseSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperSide + baseSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, upper side: "
                + upperSide + " units, base side: "
                + baseSide + " units, height: "
                + height + " units, color: "
                + getColor());
    }
}
