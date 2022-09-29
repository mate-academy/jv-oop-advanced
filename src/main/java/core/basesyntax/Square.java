package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String printInfo() {
        return "Figure: " + Square.class.getSimpleName()
                + ", area: " + getArea()
                + " units, side: " + side
                + " units, color: " + getColor().name().toLowerCase();
    }
}
