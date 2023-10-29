package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: "
                + String.format("%.2f", calculateArea())
                + " sq. units, side: "
                + String.format("%.0f", side)
                + " units, color: "
                + getColor();
    }
}
