package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(
                "Shape: right triangle, area: " + getArea() + " sq. units,"
                        + " opposite leg: " + firstLeg + " unit.,"
                        + " adjacent leg: " + secondLeg + " unit.,"
                        + " color: " + color);
    }
}
