package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private final String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public void draw() {
        System.out.println(
                "Figure: triangle, area: " + getArea()
                + " sq. units, firstLeg: " + this.firstLeg
                + " units, secondLeg: " + this.secondLeg
                + " units, color: " + this.color);
    }

    @Override
    double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
