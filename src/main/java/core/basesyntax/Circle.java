package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(String color, int radius) {
        this.radius = radius;
        this.setColor(Color.valueOf(color));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area:" + calculateArea()
                + " sq.units"
                + ", radius:" + radius
                + " units"
                + ", color:" + getColor());
    }
}
