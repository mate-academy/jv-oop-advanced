package core.basesyntax;

public class Square extends Figure {
    protected double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getFigureArea() {
        return Math.round(side * side);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: square, area: " + this.getFigureArea()
                + " sq.units, side: " + side + " units, color: " + color);
    }
}
