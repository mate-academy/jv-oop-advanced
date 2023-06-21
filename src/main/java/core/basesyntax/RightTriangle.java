package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle firstLeg=" + firstLeg + ", secondLeg=" + secondLeg + ", color='" + color
                + ", area=" + area;
    }
}
