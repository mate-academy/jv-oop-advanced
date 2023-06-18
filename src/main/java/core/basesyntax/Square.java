package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return (float) side * side;
    }

    @Override
    public String draw() {
        return String.format("Figure: square, area: %.2f sq.units, side: %d units, color: %s",
                area(), side, getColor());
    }
}


