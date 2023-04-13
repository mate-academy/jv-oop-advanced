package core.basesyntax;

public class Circle extends Figure {
    private final String color;
    private final double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    @Override
  public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
  public void draw() {
        System.out.println(
                "Figure : "
                + "circle,"
                + " radius : "
                + radius
                + " units,"
                + " color : "
                + getColor());
    }
}
