package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        if (side > 0) {
            this.side = side;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area " + getArea() + " sq.units, side: " + side
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
