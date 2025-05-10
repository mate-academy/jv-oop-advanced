package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: RightTriangle " + ", area: " + getArea()
                + ", firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + ", color: " + getColor());
    }
}
