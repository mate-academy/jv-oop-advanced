package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double sideOfSquare, String color) {
        super(color);
        this.side = sideOfSquare;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public String draw() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor();
    }
}
