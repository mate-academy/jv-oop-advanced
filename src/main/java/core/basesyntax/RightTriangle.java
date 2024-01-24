package core.basesyntax;

public class RightTriangle extends Figure {
    private Color color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq. units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
