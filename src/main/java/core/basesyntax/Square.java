package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
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
