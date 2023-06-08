package core.basesyntax;

public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, side: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), side, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
