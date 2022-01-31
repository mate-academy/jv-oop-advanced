package core.basesyntax.entity;

public class RightTriangle extends Figure{

    private double firstLeg;
    private double secondLeg;

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
