package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14159265359;
    private double radius;

    public Circle(double radius, ColorSupplier colorSuppliers) {
        super(colorSuppliers);
        this.radius = radius;
        calcSquare();
    }

    public Circle(double radius) {
        super(defaultColor);
        this.radius = radius;
        calcSquare();
    }

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", square) + " sq.units, radius: "
                + String.format("%.2f", radius) + " units, color: " + color);
    }
    
    private void calcSquare() {
        this.square = PI * radius * radius;
    }
}
