package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return (double) side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: square, "
                        + "area: %.1f sq.units, side: %d units, color: %s",
                area(), this.side, this.getColor()));
    }
}

