package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getInfo() {
        return "Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
