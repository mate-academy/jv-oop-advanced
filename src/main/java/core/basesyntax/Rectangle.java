package core.basesyntax;

public class Rectangle extends Figures {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "rectangle, area: " + area() + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor();
    }

    @Override
    public double area() {
        return firstLeg * secondLeg;
    }
}
