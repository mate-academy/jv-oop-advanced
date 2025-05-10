package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.round(0.5 * firstLeg * secondLeg * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + getArea()
                + ", first leg: " + firstLeg + ", second leg: " + secondLeg + ", color: " + color
        );
    }
}
