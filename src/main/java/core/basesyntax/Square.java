package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double countArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, side = " + side
                + " units, area = " + countArea() + " sq.units, color = " + getColor().name());
    }
}
