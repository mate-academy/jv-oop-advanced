package core.basesyntax;

public class RightTriangle extends Figure {
    public static final double MULTIPLIER = 0.5;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * MULTIPLIER;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor();
    }
}
