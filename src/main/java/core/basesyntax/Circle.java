package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double scale = Math.pow(10, 2);
        double area = Math.PI * radius * radius;
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, " + "area: " + getArea()
                            + " sq.units, radius: " + (int)radius
                + " units, color: " + getColor());
    }
}

