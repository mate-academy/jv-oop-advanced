package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;
    private String name = "Rectangle";

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq.units, first side: " + firstSide + "units, secondLeg: "
                + secondSide + "units, color: " + getColor());
    }
}
