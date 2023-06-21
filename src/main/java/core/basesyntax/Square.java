package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String info() {
        return "Figure: square, area: " + area() + " sq.units, side: " + side
                + " units, color: " + getColor().name().toLowerCase();
    }
}
