package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;
    private double area;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide,
                              double height, double area) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double findArea() {
        area = (firstSide + secondSide) / height;
        return area;
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, "
                + "firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, area: " + area
                + " sq.units, " + "height: " + height
                + " units, color: " + getColor();
    }
}
