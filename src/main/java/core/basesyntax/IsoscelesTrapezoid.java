package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int height;
    private int sideA;
    private int sideB;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double areaCalculator() {
        return ((double) height * (sideA + sideB)) / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + areaCalculator()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
