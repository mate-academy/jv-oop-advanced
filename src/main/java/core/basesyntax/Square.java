package core.basesyntax;

public class Square extends Figure {
    private final double side;
    private final String color;
    private final double areaSquare;

    public Square(double side, String color) {
        super(color);
        this.side = side;
        this.color = color;
        this.areaSquare = areaCalculator();
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public String drawable() {
        return "\nFigure: square, area: " + areaSquare + " sq.units, side: "
                + side + " units, color: " + color;
    }
}
