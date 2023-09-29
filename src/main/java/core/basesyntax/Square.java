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

    @Override
    public double findArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: square, area: " + findArea() + " sq.units, side: "
                + getSide() + " units, color: " + getColor()));
    }
}
