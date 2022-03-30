package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;
    private double area;
    private Color color;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = getArea();
        this.color = super.getColor();
    }

    @Override
    public Double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: "
                + area + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + color;
    }
}
