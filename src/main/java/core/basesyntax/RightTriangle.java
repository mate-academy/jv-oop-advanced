package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle\n"
                + "area: " + findArea() + "sq.units\n"
                + "firstLeg: " + firstLeg + "units\n"
                + "secondLeg: " + secondLeg + "units\n"
                + "color: " + getColor());
    }

    @Override
    public double findArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
