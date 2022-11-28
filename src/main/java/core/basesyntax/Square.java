package core.basesyntax;

public class Square extends Figure {
    private static final String FORM = "Figure: square, area: %.1f sq.units, side: %d units"
            + ", color: %s";
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format(FORM, getArea(), side, getColor()));
    }
}
