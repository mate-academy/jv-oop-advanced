package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstSide + secondSide) * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
