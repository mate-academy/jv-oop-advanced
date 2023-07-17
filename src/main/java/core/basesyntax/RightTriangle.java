package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;
    private final double areaRightTriangle;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.areaRightTriangle = areaCalculator();
    }

    @Override
    public double areaCalculator() {
        double half = 0.5;
        return (half * firstLeg * secondLeg);
    }

    @Override
    public String drawable() {

        return "\nFigure: rightTriangle, area: " + areaRightTriangle
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + color;
    }
}
