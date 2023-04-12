package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, Colors color) {
        super(Math.pow(side, 2), color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea()
                + " sq.units, side: "
                + getSide()
                + " units, color: "
                + getColor().toString().toLowerCase());
    }

    public int getSide() {
        return side;
    }
}
