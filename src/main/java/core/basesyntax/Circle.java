package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
