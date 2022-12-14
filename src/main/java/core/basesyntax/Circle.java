package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle" + ", area: " + area() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}
