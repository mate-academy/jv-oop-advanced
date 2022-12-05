package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle, "
                + "area: " + area() + " sq.units, "
                + "radius: " + this.radius + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
