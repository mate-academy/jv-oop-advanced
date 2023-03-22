package core.basesyntax;

public class Circle extends Figure implements Area, Draw {
    private final double radius;

    public Circle(double radius) {
        this.type = getClass().getSimpleName();
        this.radius = radius;
        this.color = ColorSupplier.getRandomColor();
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", radius: " + radius + ", color: " + color);
    }
}
