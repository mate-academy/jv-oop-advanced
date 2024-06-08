package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getDecimalFormat().format(getArea())
                + " sq. units, side: " + getDecimalFormat().format(side) + " units, color: "
                + getColor();
    }
}
