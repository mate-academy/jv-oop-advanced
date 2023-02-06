package core.basesyntax;

public class Circle extends Figure {
    private double radius = SIDE;

    public Circle(double radius, Color color) {
        this.radius = radius;
        super.color = color;
    }

    public Circle() {
    }

    @Override
    public double area() {
        return 3.14 * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.area()
                + " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }
}


