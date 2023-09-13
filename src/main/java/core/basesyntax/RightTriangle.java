package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + String.format("%,.1f", getArea())
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor().name().toLowerCase());
    }
}
