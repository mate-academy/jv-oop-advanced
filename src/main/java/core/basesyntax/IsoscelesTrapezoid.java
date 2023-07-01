package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        double medianLine = (sideA + sideB) / 2;
        return medianLine * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                            + getArea() + " m^2, aSide: "
                            + sideA + ", bSide: "
                            + sideB + ", height: "
                            + height + ", color: "
                            + getColor());
    }
}
