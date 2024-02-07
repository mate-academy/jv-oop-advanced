package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + calculateArea()
                + " sq.units, first leg: " + firstLeg
                + " sq.units, second leg: " + secondLeg
                + " units, color: " + getColor();
    }
}
