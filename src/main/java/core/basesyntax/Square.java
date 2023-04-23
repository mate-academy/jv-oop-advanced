package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String printFigure() {
        return "Figure: square, area: " + String.format("%.1f", getArea())
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
