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
    public void draw() {
        System.out.println("Figure: right triangle, area: " +  String.format("%.2f", getArea())
                + " sq. units, first leg: " + String.format("%.2f", firstLeg) + " units, second leg: "
                + String.format("%.2f", secondLeg) + " units, color: " + super.color);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
