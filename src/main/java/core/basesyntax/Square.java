package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void display() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq.units, side: " + side
                + ", color: " + getColor());
    }
}
