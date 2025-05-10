package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private static final String TYPE = "rectangle";
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
  public double calculateArea() {
        return length * width;
    }

    @Override
  public void draw() {
        System.out.println("Figure: " + TYPE + ", area: " + getRoundedValue(calculateArea())
                + " sq. units, length: " + getRoundedValue(length) + " units, width: "
                + getRoundedValue(width) + " units, color: " + getColor());
    }
}
