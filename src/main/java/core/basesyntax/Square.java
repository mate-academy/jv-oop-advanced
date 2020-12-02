package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Colour colour) {
        this.colour = colour;
        this.side = side;
    }

    public double getDiagonal() {
        return Double.parseDouble(String.format("%.2f", Math.sqrt(2 * side)));
    }

    public int getSide() {
        return side;
    }

    @Override
    public void getArea() {
        area = side * side;
    }
}
