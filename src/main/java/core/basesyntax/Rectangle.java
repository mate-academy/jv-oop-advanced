package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(Color color, String name, double firstLeg, double secondLeg) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.1f sq.units, "
                        + "firstLeg: %.1f units, "
                        + "secondLeg: %.1f units, "
                        + "color: %s\n",
                getName(), getArea(), firstLeg, secondLeg, getColor());
    }
}
