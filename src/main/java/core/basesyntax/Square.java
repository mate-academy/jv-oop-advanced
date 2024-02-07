package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Square{"
                + "area=" + getArea()
                + ", side=" + side
                + ", color=" + getColor().name() + '}';
    }
}
