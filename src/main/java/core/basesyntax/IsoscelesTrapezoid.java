package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double height;
    private double firstSide;
    private double secondSide;

    public IsoscelesTrapezoid(double height, double firstSide, double secondSide, String color) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) / 2 * height);
    }

    @Override
    public String getInfo() {
        return ("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, height: "
                + height + ", first side: " + firstSide + ", second side: "
                + secondSide + " units, color: " + color);
    }
}
