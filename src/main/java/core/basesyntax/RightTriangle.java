package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private double side;

    public RightTriangle(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }

    @Override
    public String getValue() {
        return String.valueOf(side);
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: " + getArea()
                + " sq.units, side: "
                + getValue() + " units, color: "
                + getColor();
    }
}
