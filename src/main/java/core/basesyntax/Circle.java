package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private final int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getAreaFigures() {
        return getArea(Math.PI * radius * radius);
    }

    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor());
    }
}
