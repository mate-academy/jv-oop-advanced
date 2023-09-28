package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
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
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + Math.round(calculateArea() * 10.0) / 10.0 + " sq.units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
