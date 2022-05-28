package core.basesyntax;

public class Square extends Figure implements GetArea, ToDrawFigure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toDraw() {
        return " Figure: RightTriangle, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
