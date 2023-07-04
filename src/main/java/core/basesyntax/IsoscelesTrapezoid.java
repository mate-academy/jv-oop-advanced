package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.firstSide = sideA;
        this.secondSide = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        double medianLine = (firstSide + secondSide) / 2;
        return medianLine * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                            + getArea() + " m^2, aSide: "
                            + firstSide + ", bSide: "
                            + secondSide + ", height: "
                            + height + ", color: "
                            + getColor());
    }
}
