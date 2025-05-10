package core.basesyntax;

import core.basesyntax.enums.FigureType;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.RECTANGLE.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, firstLeg : "
                + this.firstLeg + " units, " + " secondLeg: "
                + this.secondLeg + " units, color: " + getColor());
    }
}
