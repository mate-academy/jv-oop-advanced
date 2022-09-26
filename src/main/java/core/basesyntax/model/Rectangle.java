package core.basesyntax.model;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, firstLeg = " + firstLeg
                + " units, secondLeg = " + secondLeg + " units, colour: " + getColor();
    }
}
