package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setType("Right triangle");
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq.units, first leg: %s units, "
                        + "second leg: %s units, color: %s%n",
                getType(), getArea(), firstLeg, secondLeg, getColor());
    }
}
