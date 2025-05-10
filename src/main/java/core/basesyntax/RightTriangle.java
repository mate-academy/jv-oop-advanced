package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        double rightTriangleArea;
        rightTriangleArea = (firstLeg * secondLeg) / 2.0;
        return rightTriangleArea;
    }

    public void draw() {
        System.out.println("Figure: RightTriangle, " + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, " + "secondLeg: " + secondLeg
                + " units, " + "color: " + getColor());
    }
}
