package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + area() + " sq.units, side: " + side + " units, color: "
                + getColor();
    }
}
