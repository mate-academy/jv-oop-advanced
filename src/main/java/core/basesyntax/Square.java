package core.basesyntax;

public class Square extends Figure implements FigureProperties {
    private double side;
    ColorSupplier colorSupplier = new ColorSupplier();

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Figure: square. Side: " + side + " mm. Area: " + getArea() + " sq.mm. Color: " +
                colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
