package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Trapezoid, area:" + this.getArea() + " sq.units, sideA: "
                + sideA + "units, sideB: " + sideB + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * height * (sideB + sideA);
    }
}
