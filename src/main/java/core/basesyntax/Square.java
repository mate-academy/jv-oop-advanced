package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round(side * side);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
