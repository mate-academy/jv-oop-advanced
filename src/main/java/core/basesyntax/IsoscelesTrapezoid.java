package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;
    private double height;
    private double area;
    private Color color;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
        this.area = getArea();
        this.color = super.getColor();
    }

    @Override
    public Double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: "
                + area + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, height: "
                + height + " units, color: "
                + color;
    }
}
