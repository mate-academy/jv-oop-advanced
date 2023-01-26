package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double CONSTANT = 0.5;
    private double baseUpper;
    private double baseLower;
    private double height;

    public IsoscelesTrapezoid(Color color, double baseLower,
                              double baseUpper, double height) {
        super(color);
        this.baseLower = baseLower;
        this.baseUpper = baseUpper;
        this.height = height;
    }

    @Override
    public double areaCalculator() {
        return (baseLower + baseUpper) * CONSTANT * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + areaCalculator()
                + " sq.units, Lower base: " + baseLower + " units, Upper base: " + baseUpper
                + " units, Height: " + height + " units, color: " + getColor());
    }
}
