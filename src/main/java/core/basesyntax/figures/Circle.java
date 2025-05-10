package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String colorSupplier, double radius) {
        super(colorSupplier);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: "
                    + String.format("%.2f", getArea())
                    + " sq.units, radius: "
                    + String.format("%.2f", radius)
                    + " units, color: " + getColor());
    }
}
