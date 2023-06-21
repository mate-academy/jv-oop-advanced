package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.area = getArea();
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "firstLeg=" + firstLeg +
                ", secondLeg=" + secondLeg +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
