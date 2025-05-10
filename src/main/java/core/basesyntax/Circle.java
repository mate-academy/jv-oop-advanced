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

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + String.format("%.1f", getArea()) + " sq. units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor());
    }
}
