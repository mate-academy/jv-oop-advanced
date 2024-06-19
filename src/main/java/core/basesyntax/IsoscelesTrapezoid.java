package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseUpper;
    private double baseLower;
    private double height;

    public IsoscelesTrapezoid(String color, double baseUpper, double baseLower, double height) {
        super(color);
        this.baseUpper = baseUpper;
        this.baseLower = baseLower;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseUpper + baseLower) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, upper base: "
                + baseUpper + " units, lower base : "
                + baseLower + " units, height : "
                + height + " units, color: "
                + color);
    }
}
