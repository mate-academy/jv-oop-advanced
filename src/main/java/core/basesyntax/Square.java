package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + String.format("%.1f", getArea())
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
