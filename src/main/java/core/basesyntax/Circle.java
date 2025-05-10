package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", calculateArea()) + " sq.units, radius: "
                + String.format("%.2f", radius) + " units, color: " + color);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
