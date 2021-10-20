package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        this.firstLeg = random.nextInt(MAX_NUMBER);
        this.secondLeg = random.nextInt(MAX_NUMBER);
        area = getArea();
    }

    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: "
                + String.format("%.2f", area) + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: "
                + color;
    }
}
