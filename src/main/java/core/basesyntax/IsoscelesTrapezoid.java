package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double a, double b, double height, String color) {
        super(color);
        this.sideA = a;
        this.sideB = b;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure isosceles trapezoid, area: " + getArea()
                + " sq. units, sideA: " + sideA + " units, sideB: "
                + sideB + " units, height: "
                + height
                + " units, color: " + color);
    }
}
