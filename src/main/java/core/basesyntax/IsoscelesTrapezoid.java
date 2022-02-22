package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid() {

    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (double)(sideA + sideB + 2 * sideC) / 2.0;
        return Math.sqrt((p - sideA) * (p - sideB) * (2 * (p - sideC)));
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "sideA: " + getSideA() + " units, "
                + "sideB: " + getSideB() + " units, "
                + "sideC: " + getSideC() + " units, "
                + "color: " + getColor();
    }
}
