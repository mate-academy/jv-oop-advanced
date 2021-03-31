package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String figureColor) {
        super("Square", figureColor);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units, side length: "
                + side + "units, color: " + getFigureColor();
    }
}
