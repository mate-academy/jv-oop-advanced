package core.basesyntax.entity.figure;

public class Square extends Figure {
    private final int side;

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
        System.out.println(String.format(
                "Figure: square, area: %.2f sq.units, color: %s, side: %d units.",
                getArea(), super.getColor(), side));
    }
}
