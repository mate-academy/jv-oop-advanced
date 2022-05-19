package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setName("rectangle");
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
