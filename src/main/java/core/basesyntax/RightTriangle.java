package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + String.format("%.2f", calculateArea())
                + " sq.units, first Leg: " + firstLeg
                + " units, second Leg: " + secondLeg + " units, color: " + getColor().name());
    }
}
