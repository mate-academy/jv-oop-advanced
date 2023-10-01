package core.basesyntax.model;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
