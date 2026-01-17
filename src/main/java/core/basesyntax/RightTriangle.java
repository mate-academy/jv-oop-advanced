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
        return firstLeg * secondLeg / 2;
    }

    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                    + " sq. units, firstLeg: " + firstLeg + " secondLeg: "
                    + secondLeg + " color: " + color);
    }
}
