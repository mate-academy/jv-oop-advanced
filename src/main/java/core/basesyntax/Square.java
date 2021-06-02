package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return String.format("Figure: Square, area: %.2f sq.units, side: %.3f units, color: %s",
                getArea(), side, color);
    }
}
