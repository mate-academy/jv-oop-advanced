package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units,"
                + " side: " + getSide() + " units,"
                + " color: " + getColor());
    }
}
