package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArray() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArray() + " sq. units, side: "
                + side + " units, color: " + getColor());
    }
}
