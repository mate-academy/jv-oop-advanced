package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.print("\nType: circle"
                + "\nRadius: " + radius
                + "\n Area: " + getArea()
                + "\nColor: " + getColor()
                + "\n-----------");
    }

    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }
}
