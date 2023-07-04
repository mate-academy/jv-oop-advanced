package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int FORMULA_NUMBER = 2;
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double findArea() {
        return (double)(firstLeg * secondLeg) / FORMULA_NUMBER;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: right triangle, area: "
                + findArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor());
    }
}
