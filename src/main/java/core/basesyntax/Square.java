package core.basesyntax;

public class Square extends Figure {
    private double length;

    public Square(Color color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, length: " + length
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}
