package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure : Circle " + "color: " + getColor()
                + " radius " + String.format("%.2f", radius)
                + " area: " + String.format("%.2f", getArea()) + '}');
    }
}

