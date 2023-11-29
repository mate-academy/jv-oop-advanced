package core.basesyntax;

public class Circle extends Figure {
    private final String circleColor;
    private final double radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.circleColor = color;
    }

    public Circle(int radius, Color color) {
        this.circleColor = color.name();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + circleColor);
    }
}
