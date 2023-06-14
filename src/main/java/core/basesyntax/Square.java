package core.basesyntax;

public class Square extends Figure {

    private int side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String canDraw() {
        return String.format("Figure: square, area: %.2f sq.units, side: %d units, color: %s",
                (float) side * side, side, color);
    }
}


