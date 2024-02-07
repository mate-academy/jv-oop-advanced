package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double findArea() {
        return (firstSide + secondSide) / height;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, "
                + "firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, area: " + findArea()
                + " sq.units, " + "height: " + height
                + " units, color: " + getColor();
    }
}
