package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstLeg;
    private final int height;
    private final int secondLeg;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
        setColor(color);
    }

    public double calculateAndSetArea() {
        return (firstLeg * secondLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + calculateAndSetArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, height: " + height + ", color: " + getColor());
    }
}
