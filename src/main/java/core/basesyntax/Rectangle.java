package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, "
                       + "firstLeg: %.1f units, secondLeg: %.1f units, color: %s\n",
                "rectangle", getArea(), firstLeg, secondLeg, color);
    }
}
