package core.basesyntax;

public class Square extends BaseFigure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.1f sq.units, "
                       + "side: %d units, color: %s%n", getArea(), side,
                color.toString().toLowerCase());
    }
}
