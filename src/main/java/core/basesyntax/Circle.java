package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
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
        System.out.println("Figure: circle, area: " + this.getArea()
                + " sq. units, radius: " + this.radius
                + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
