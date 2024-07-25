package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return ((double) Math.round(Math.PI * radius * radius * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, " + "radius: "
                + radius + " units, " + " color: " + getColor());
    }
}
