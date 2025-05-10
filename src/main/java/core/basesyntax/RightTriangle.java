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
    public void printInfo() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + ", first leg: " + firstLeg
                + ", second leg: " + secondLeg
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
