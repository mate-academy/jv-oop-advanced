package core.basesyntax.figure;

public class Rectangle extends Figure {

    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "firstLeg: %d units, secondLeg: %d units, "
                + "color: %s\n", "rectangle", getArea(), firstLeg, secondLeg, getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }
}
