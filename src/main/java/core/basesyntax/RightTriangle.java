package core.basesyntax;

public class RightTriangle extends Superclass {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public String getArea() {
        double half = 0.5;
        return "\nFigure: rightTriangle, area: " + (half * firstLeg * secondLeg)
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + color;
    }
}
