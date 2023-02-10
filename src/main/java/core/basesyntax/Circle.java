package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14159265359;
    private double radius;

    public Circle(double radius, ColorSupplier colorSuppliers) {
        super(colorSuppliers);
        this.radius = radius;
    }

    public Circle(double radius) {
        super(defaultColor);
        this.radius = radius;
    }

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", calculateArea()) + " sq.units, radius: "
                + String.format("%.2f", radius) + " units, color: " + color);
    }
    
    public double calculateArea() {
        return PI * radius * radius;
    }
}
