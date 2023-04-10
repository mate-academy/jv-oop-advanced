package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.setRadius(radius);
    }

    private String color() {
        return getColor();
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " units, radius: " + radius + " units, color: " + color());
    }
}
