package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * 2 / height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, sideA: " + sideA
                + ", sideB: " + sideB
                + ", height: " + height
                + ", colour: " + getColour());
    }

}
