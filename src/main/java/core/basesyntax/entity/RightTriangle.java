package core.basesyntax.entity;

public class RightTriangle extends Figure{

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area:"
                + String.format("%.1f", getArea()) + ", firstLeg: " + String.format("%.2f", firstLeg)
                + " units, secondLeg: " + String.format("%.2f", secondLeg) + " units, "
                + "color: " + this.color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
