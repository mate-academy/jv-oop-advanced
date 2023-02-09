package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "firstLeg: %d units, secondLeg: %d units, height: %d units, "
                + "color: %s\n",
                "isosceles trapezoid", getArea(), firstLeg, secondLeg, height, getColor());
    }
}
