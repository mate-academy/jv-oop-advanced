package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) Math.round(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        String name = "circle";
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
