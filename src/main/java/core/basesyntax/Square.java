package core.basesyntax;

public class Square extends Figure {
    int side;
    public Square(int side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    void drawFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side +
                " units, color: " + new ColorSupplier().getRandomColor().toLowerCase());
    }
}
