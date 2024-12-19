package core.basesyntax.classes.figures;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void drawData() {
        System.out.printf("Figure: square, area: %.1f sq. units, side: %d units,"
                + " color: %s%n", this.calculateArea(), side, super.getColor());
    }
}
