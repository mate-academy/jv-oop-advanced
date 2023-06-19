package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
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
    public double calculateArea() {
        return side * side;
    }

    @Override
    public Shape getShape() {
        return Shape.SQUARE;
    }

    @Override
    public String getSizeDescription() {
        return "side: " + side + " units";
    }
}
