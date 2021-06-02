package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, "
                + "area: " + area + " sq.unit, "
                + "sides: " + firstLeg + " " + secondLeg + " units, "
                + "color: " + color.name().toLowerCase();
    }
}
