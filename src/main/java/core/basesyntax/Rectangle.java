package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(final String color, final double firstSide, final double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return this.firstSide * this.secondSide;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: Rectangle, "
                        + "area: %.1f sq.units, "
                        + "firstSide: %.1f units, "
                        + "secondSide: %.1f units, "
                        + "color: %s%n",
                this.getArea(), this.firstSide, this.secondSide, super.getColor()
        );
    }
}
