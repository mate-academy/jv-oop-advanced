package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, "
                + "area: " + area() + " sq.units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor());
    }
}
