package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius) * 10.0 / 10.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, color: " + getColor());
    }
}
