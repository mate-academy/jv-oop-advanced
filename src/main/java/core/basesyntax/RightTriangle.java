package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Colors color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void print() {
        System.out.println(
                "Figure: Right Triangle, "
                        + "area: " + getArea() + " sq. units, "
                        + "firstLeg: " + firstLeg + " units, "
                        + "secondLeg: " + secondLeg + " units, "
                        + "color: " + getColor().name());
    }
}
