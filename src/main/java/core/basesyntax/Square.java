package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: square; area: " + getArea() + " square units;"
                + " side: " + side + " units; "
                + getColor());
    }
}
