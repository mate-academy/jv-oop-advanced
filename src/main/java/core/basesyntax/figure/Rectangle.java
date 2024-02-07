package core.basesyntax.figure;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    protected double firstLeg;
    protected double secondLeg;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + area()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + color.toString().toLowerCase();
    }
}
