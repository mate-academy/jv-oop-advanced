package core.basesyntax.figures;

import core.basesyntax.utils.Color;

public class Rectangle extends Square {

    private double side2;

    public Rectangle(double side, double side2) {
        super(side);
        this.side2 = side2;
    }

    public Rectangle(Color color, double side, double side2) {
        super(color, side);
        this.side2 = side2;
    }

    public Rectangle(double area, Color color, double side, double side2) {
        super(area, color, side);
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double calculate() {
        return getSide() * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + calculate()
                + " sq. units, " + "side1: " + getSide()
                + " units, side2: " + side2 + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
