package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle, "
                + "getArea: " + getArea() + " sq.units, "
                + "radius: " + this.radius + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
