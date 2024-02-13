package core.basesyntax.models;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area "
                + getArea()
                + " units, radius: "
                + radius
                + ", color: "
                + color
        );
    }
}
