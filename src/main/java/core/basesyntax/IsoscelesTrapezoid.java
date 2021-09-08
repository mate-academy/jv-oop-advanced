package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double leg;
    private double height;

    public IsoscelesTrapezoid(String color,double upperSide, double lowerSide, double height, double leg) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return (upperSide + lowerSide) * height / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, " + "area: " + getArea() + " sq.units," + " upper side: " + upperSide + " units," + " lower side: " + lowerSide + " units," + " leg: " + leg + " units," + " height: " + height + " units," + " color: " + getColor());
    }
}
