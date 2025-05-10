package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + calculateArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor());
    }
}
