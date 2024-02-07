package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square"
                + ", area: "
                + calculateArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor().name());
    }
}
