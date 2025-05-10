package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String name, String color, int firstSide, int secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (double) firstSide * secondSide;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.2f sq.units,"
                + "firstSide: %d units, secondSide: %d units,"
                + "color: %s", getName(), getArea(), firstSide, secondSide, getColor());
    }
}
