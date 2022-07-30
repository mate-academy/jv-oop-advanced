package core.basesyntax;

public class Square extends Figure {

    private final double side;
    private final Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: square Area: " + getArea() + " sq.units"
                + " Side: " + side
                + " Color: " + color + "\n";
    }
}
