package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getValue() {
        return String.valueOf(side);
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: "
                + getValue() + " units, color: "
                + getColor();
    }

}
