package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: Square, area: " + String.format("%.2f", getArea()) + " sq.units, side: "
                + String.format("%.2f", side) + " units, color: " + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}
