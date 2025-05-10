package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Right Triangle, area = %.3f sq.units, first leg = %.3f units"
                + ", second leg = %.3f units, color - %s\n",
                calculateArea(), firstLeg, secondLeg, getColor());
    }
}
