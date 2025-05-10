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
        System.out.println("Figure: " + TYPE + ", area: " + getRoundedValue(calculateArea())
                + " sq. units, radius: " + getRoundedValue(radius) + " units, color: "
                + getColor());
    }
}
