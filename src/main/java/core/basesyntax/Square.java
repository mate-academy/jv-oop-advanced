package core.basesyntax;

public class Square extends Figure {
    private static final int SIDE_SQUARE = 4;

    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.cm., side: " + SIDE_SQUARE + " units, color: " + getColor());
    }
}
