package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final double baseUpper;
    private final double baseLower;
    private final double height;

    public IsoscelesTrapezoid(double baseUpper, double baseLower, double height, String color) {
        super(color);
        this.baseUpper = baseUpper;
        this.baseLower = baseLower;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseUpper + baseLower) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area " + getArea()
                + " sq.units, base lower: " + baseLower
                + " units, base upper: " + baseUpper + " units, heigh: " + height
                + " units, color: " + getColor());
    }
}
