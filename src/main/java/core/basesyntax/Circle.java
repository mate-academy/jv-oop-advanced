package core.basesyntax;

public class Circle extends Figure {
    private final float radius;

    public Circle(Colors color, float radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + area() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}
