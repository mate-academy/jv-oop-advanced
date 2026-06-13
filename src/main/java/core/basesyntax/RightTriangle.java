package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + String.format("%.1f", getArea())
                + " sq. units, firstLeg: " + (int) firstLeg
                + " units, secondLeg: " + (int) secondLeg
                + " units, color: " + getColor().toLowerCase());
    }
}
