package core.basesyntax;

public class Square extends Figure implements AreaCalculator, FigureDraw {
    private double side;

    public Square(String color, double sideOfSquare) {
        super(color);
        this.side = side;
    }

    public double getSideOfSquare() {
        return side;
    }

    public void setSideOfSquare(double sideOfSquare) {
        this.side = sideOfSquare;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
