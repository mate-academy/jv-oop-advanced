package core.basesyntax.figure;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "firstLeg: %d units, secondLeg: %d units, "
                + "color: %s\n", "rectangle", getArea(), firstSide, secondSide, getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
