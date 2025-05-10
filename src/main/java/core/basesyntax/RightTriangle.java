package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    public void draw() {
        System.out.println("core.basesyntax.Figure: right triangle, area: "
                + getArea() + " sq. units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg);
    }
}
