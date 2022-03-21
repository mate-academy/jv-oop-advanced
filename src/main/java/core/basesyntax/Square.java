package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String nameFigure, int side, String colorFigure) {
        super(nameFigure, colorFigure);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure"
                + ": square"
                + ", area: " + getArea() + " sq.units"
                + ", side: " + side + " units"
                + ", color: " + getColorFigure();
    }
}
