package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        area = firstLeg * secondLeg;
        return area;
    }

    @Override
    public String drawFigure() {
        System.out.println("Figure: rectangle, "
                + "area: " + Math.floor(area) + " sq.units, "
                + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", color: " + color.toString().toLowerCase());
        return null;
    }
}
