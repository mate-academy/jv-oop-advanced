package core.basesyntax;

public class Square extends Figure {
    public static final int RANGE = 10;
    private double side;

    public Square() {
        this.side = Math.random() * RANGE;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + String.format("%.1f", getArea())
                + " sq. units, side length: " + String.format("%.1f", side)
                + " units, color:" + getColor());
    }
}
