package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private int firstLeg;
    private int secondLeg;
    private ColorSupplier supplier = new ColorSupplier();

    public IsoscelesTrapezoid(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2.0;
    }

    @Override
    public String getValue() {
        return firstLeg + " units, secondLeg: " + secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, firstLeg: "
                + getValue() + " units, color: "
                + supplier.getRandomColor();
    }
}
