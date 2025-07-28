package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("area: " + getArea() + "radius: " + radius + "color: " + getColor());
    }
}
