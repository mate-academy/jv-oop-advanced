package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        setArea(radius * radius * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is Circle, my area: " + getArea()
                + " my radius: " + radius + " my color: " + getColor());
    }
}
