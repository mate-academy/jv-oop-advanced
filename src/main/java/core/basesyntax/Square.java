package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: " + getArea() + " sq. units"
                + ", side length: " + side
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
