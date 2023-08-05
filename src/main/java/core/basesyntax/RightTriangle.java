package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg + " units, color: " + getColor());
    }
}
