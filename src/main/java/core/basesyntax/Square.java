package core.basesyntax;

public class Square extends Figure {
    private final double side;

    Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double countArea() {
        return side * side;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: square, area: " + countArea() + " sq.units, side:"
                + side + " units, color: " + color);
    }
}
