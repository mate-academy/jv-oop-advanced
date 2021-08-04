package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    int firstLeg;
    int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg
                + " units, secondLeg: " + secondLeg);
    }

    @Override
    public String getArea() {
        return String.format("%.1f", (double) (firstLeg * secondLeg / 2));
    }
}
