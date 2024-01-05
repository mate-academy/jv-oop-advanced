package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println(
                "Figure: circle, area: " + getArea()
                        + " sq. units, radius: " + this.radius
                        + " units, color: " + this.color);
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
