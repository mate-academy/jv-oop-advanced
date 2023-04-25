package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + calculateArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: "
                + getColor());
    }
}
