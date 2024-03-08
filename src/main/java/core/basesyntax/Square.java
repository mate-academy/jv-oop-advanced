package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
        return null;
    }
}
