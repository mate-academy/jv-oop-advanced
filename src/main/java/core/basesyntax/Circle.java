package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double areaCalculating() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", " + "area: " + areaCalculating()
                + " sq.units, " + "radius: " + this.radius + " units, " + "color: " + getColor());
    }
}
