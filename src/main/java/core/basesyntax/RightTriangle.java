package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: right triangle, area: %.2f sq. units, "
                        + "first leg: %.2f units, "
                        + "second leg: %.2f units, "
                        + "color: %s",
                getArea(), firstLeg, secondLeg, super.color));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
