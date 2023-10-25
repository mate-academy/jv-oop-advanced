package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upperSide, double lowerSide, double heigth) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = heigth;
    }

    @Override
    public double getArea() {
        return 0.5 * ((upperSide + lowerSide) * height);
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, upper side: "
                + upperSide
                + " units, lower side: "
                + lowerSide + " units, height: "
                + height + " units, color: "
                + getColor());
        return null;
    }
}
