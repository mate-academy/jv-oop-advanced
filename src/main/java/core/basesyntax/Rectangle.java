package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double area() {
        return firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + area() + " sq.units, firstLeg: " + firstLeg + " units,"
                + " secondLeg: " + secondLeg + " units, color: " + getColor();
    }
}
