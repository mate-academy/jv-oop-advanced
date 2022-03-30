package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;
    private double area;
    private Color color;

    public Rectangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = getArea();
        this.color = super.getColor();
    }

    @Override
    public Double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: "
                + area + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + color;
    }
}
