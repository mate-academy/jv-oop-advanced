package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDraw() {
        return "Figure: square, area: " + getArea() + ", side: " + side + ", color: " + getColor();
    }
}
