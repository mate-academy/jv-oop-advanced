package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double upperSide;
    private double bottomSide;

    public IsoscelesTrapezoid(String color, double height,
                              double upperSide, double bottomSide) {
        super(color);
        this.height = height;
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public double getArea() {
        return Math.round((upperSide + bottomSide) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, height: "
                + height + " units, upper side: "
                + upperSide + " units , bottom side: "
                + bottomSide + " units, color: " + getColor());
    }
}
