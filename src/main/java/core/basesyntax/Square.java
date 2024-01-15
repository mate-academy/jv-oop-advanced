package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(final String color, final double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: Square, area: %.1f sq.units, side: %.1f units, color: %s%n",
                this.getArea(), this.side, super.getColor()
        );
    }
}
