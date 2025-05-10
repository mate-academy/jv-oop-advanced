package core.basesyntax.figure.core;

public class Square extends Figure {
    private double side;

    public Square(String colorOfFigure, double side) {
        super(colorOfFigure);
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
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide() + " units, color: " + getColorOfFigure());
    }
}
