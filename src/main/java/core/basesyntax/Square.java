package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + this.getArea() + " sq. units, side length: " + this.side
                + " units, color: " + this.getColor();
    }
}
