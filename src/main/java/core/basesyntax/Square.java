package core.basesyntax;

public class Square extends Figure {
    public static final int MAX_SIDE = 30;
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
    public double getArea() {
        return side * side;
    }

    @Override
    public void printFigureInfo() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
