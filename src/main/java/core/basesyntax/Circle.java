package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
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
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Fugure: "
                + this.getClass().getName()
                + ", area: "
                + getArea()
                + " sq.units, radius: "
                + getRadius()
                + "units, color "
                + getColor()
        );
    }
}
