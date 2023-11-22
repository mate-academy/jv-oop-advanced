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
        double area = calculateArea();
        double roundedArea = Math.round(area * 100.0) / 100.0;
        double roundedLength = Math.round(length * 100.0) / 100.0;
        double roundedWidth = Math.round(width * 100.0) / 100.0;

        System.out.println("Figure: " + TYPE + ", area: " + roundedArea + " sq. units, length: "
                + roundedLength + " units, width: " + roundedWidth + " units, color: "
                + getColor());
    }
}
