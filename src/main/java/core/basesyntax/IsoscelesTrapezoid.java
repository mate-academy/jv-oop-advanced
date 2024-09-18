package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(Colors color, double side, double sideB, double height) {
        super(color, side);
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea() + "sq. units, side "
                + getSide() + " units, sideB " + sideB
                + " units, color: " + getColor().name());
    }

    @Override
    public double getArea() {
        return (getSide() + sideB) / 2 * height;
    }
}
