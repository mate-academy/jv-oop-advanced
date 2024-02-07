package core.basesyntax;

public class IsoscelesTrapezoid extends Rectangle {
    private final int sideC;

    public IsoscelesTrapezoid(String name, String color, int sideA, int sideB, int sideC) {
        super(name, color, sideA, sideB);
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return (double) (getSideA() + getSideB()) / 4
                * Math.sqrt(4 * sideC * sideC - (getSideA() - getSideB())
                * (getSideA() - getSideB()));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + this.getArea() + " sq.units," + " sideA: "
                + getSideA() + " units," + " sideB: "
                + getSideB() + " units," + " sideC: "
                + sideC + " units," + " color: " + getColor());
    }
}
