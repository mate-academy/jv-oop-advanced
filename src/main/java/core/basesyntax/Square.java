package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super.setColor(color);
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + String.format("%.1f", calculateArea())
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
