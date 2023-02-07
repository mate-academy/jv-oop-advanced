package core.basesyntax;

public class Square extends Figure {
    private static final String NAME = "square";
    private final int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, side: %d units, color: %s\n",
                NAME, calculateArea(), side, getColor().toString());

    }
}
