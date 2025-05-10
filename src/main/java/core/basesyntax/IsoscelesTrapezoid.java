package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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
        double firstPart = (getSideA() + getSideB()) / 2;
        double secondPart = ((getSideA() - getSideB()) * (getSideA() - getSideB()) / 4);
        return firstPart * Math.sqrt(getSideC() * getSideC() - secondPart);
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.units, sideA: " + getSideA() + " units, sideB: " + getSideB()
                + " units, sideC: " + getSideC() + " units, color: " + getColor());
    }
}
