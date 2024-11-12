package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateSquare() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + calculateSquare()
                + " sq. units, side: " + side
                + " units, color: "
                + color;
    }
}
