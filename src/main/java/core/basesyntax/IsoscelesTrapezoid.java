package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
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
    public double getArea() {
        return (baseLower + baseUpper) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, Lower base: " + baseLower + " units, Upper base: " + baseUpper
                + " units, Height: " + height + " units, color: " + getColor());
    }
}
