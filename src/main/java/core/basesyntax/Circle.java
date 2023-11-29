package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private String color = getColor();

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(int radius, Color color) {
        this.color = color.name();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + color);
    }
}
