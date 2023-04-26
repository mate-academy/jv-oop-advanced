package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        System.out.println("Figure: circle");
        System.out.println("Area: " + getArea() + " sq.units");
        System.out.println("Radius: " + radius + " units");
        System.out.println("Color: " + getColor());
    }
}
