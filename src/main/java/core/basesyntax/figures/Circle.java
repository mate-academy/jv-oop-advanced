package core.basesyntax.figures;

import static java.lang.Math.PI;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private static final String TYPE = "circle";
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
  public double calculateArea() {
        return radius * radius * PI;
    }

    @Override
  public void draw() {
        double area = calculateArea();
        double roundedArea = Math.round(area * 100.0) / 100.0;
        double roundedRadius = Math.round(radius * 100.0) / 100.0;

        System.out.println("Figure: " + TYPE + ", area: " + roundedArea + " sq. units, radius: "
                + roundedRadius + " units, color: " + getColor());
    }
}
