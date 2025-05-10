package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right-triangle, area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, " + "secondLeg: "
                + secondLeg + " units, color: "
                + getColor().toLowerCase());
    }
}
