package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + Double.toString(getArea())
                + ", perimeter: " + Double.toString(getPerimeter())
                + ", radius: " + Double.toString(radius)
                + ", color: " + color
        );
    }

    @Override
    public double getArea() {
        return radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return  2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            throw new RuntimeException("Radius may be more than 0!");
        }
    }

    public double getDiameter() {
        return radius * 2;
    }
}
