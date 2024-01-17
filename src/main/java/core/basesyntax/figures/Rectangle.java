package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getStringFormat(calculateArea())
                + " sq. units, First leg: " + getStringFormat(firstLeg) + " units, "
                + "Second Leg: " + getStringFormat(secondLeg) + " units, "
                + "color: " + getColor());
    }
}
