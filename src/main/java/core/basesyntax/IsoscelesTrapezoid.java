package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;

    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: IsoscelesTrapezoid " + ", area: " + getArea()
                + ", sideA: " + sideA + ", sideB: " + sideB + ","
                + " height: " + height + ", color: " + getColor());
    }
}
