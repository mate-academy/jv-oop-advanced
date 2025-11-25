package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public RightTriangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return 0.5 * firstSide * secondSide;
    }

    public void draw() {
        System.out.println("Figure: triangle, area: " + formatDouble(getArea())
                + " sq. units, firstLeg: " + formatDouble(firstSide)
                + " units, secondLeg: " + formatDouble(secondSide)
                + " units, color: " + getColor());
    }
}
