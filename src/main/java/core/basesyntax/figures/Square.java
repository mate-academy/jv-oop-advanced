package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + calculateArea() + " units, side "
                + side + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
