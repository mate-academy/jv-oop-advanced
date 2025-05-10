package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle , area: " + getArea() + " m2, " + "radius: "
                + radius + " m, " + " color: " + getColor());
    }

}
