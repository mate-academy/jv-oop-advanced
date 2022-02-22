package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    @Override
    public double getArea() {
        double p = (double)(sideA + sideB + 2 * sideC) / 2.0;
        return Math.sqrt((p - sideA) * (p - sideB) * (2 * (p - sideC)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "sideA: " + getSideA() + " units, "
                + "sideB: " + getSideB() + " units, "
                + "sideC: " + getSideC() + " units, "
                + "color: " + getColor());
    }
}
