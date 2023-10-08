package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int sideC;

    public IsoscelesTrapezoid(int baseA, int baseB, int sideC) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.sideC = sideC;
    }

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(int basesA) {
        this.baseA = basesA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(int basesB) {
        this.baseB = basesB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt((baseA + baseB) * (baseA + baseB)
                * (baseA - baseB + 2 * sideC) * (baseB - baseA + 2 * sideC));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, baseA: " + getBaseA() + " units, baseB: " + getBaseB()
                + " units, sideC: " + getSideC() + " units, color: " + getColor());
    }
}
