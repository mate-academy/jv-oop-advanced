package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: circle, area: " + area()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (radius * Math.PI) * 2;
    }
}
