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
                + getArea() + ", firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, "
                + "color: " + this.color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
