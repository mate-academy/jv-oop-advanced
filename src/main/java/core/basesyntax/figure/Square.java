package core.basesyntax.figure;

public class Square extends Figure {
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
        System.out.printf("Figure: square, area: %.2f sq.units, side: %d units, color: %s%n",
                getArea(), side, getColor().toLowerCase());
    }
}
