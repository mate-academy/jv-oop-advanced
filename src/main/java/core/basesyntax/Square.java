package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, Color color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square Area: " + getArea() + " sq.units"
                + " Side: " + side
                + " Color: " + getColor() + "\n";
    }
}
