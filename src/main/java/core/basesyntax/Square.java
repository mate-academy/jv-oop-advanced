package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, "
                + "area: %.2f sq.units, "
                + "side: %d units, "
                + "color: %s"
                + System.lineSeparator(), getArea(), side, getColor());
    }
}
