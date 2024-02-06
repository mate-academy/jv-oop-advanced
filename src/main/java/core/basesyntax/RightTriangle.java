package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, firstLeg: " + this.firstLeg
                + " secondLeg: " + this.secondLeg + " units, color: "
                + this.color.toString().toLowerCase());
    }
}
