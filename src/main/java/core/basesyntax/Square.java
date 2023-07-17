package core.basesyntax;

public class Square extends Superclass {
    private final double side;
    private final String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public String getArea() {
        return "\nFigure: square, area: " + (side * side) + " sq.units, side: "
                + side + " units, color: " + color;
    }
}

