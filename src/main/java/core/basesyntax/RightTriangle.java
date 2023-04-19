package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void printInfo() {
        setArea(0.5 * firstLeg * secondLeg);
        System.out.println("Figure: right triangle, area: " + getArea() + ", first leg: " + firstLeg + ", second leg: " + secondLeg + ", color: " + getColor());
    }
}
