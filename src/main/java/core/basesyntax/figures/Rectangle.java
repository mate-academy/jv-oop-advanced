package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double areaCalc() {
        double area = firstLeg * secondLeg;
        return getRound(area);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + areaCalc()
                + " sq. units, First leg: " + firstLeg + " units, "
                + "Second Leg: " + secondLeg + " units, "
                + "color: " + getColor());
    }
}
