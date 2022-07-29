package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "RightTriangle{" +
                "firstLeg=" + firstLeg +
                ", secondLeg=" + secondLeg +
                '}';
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
