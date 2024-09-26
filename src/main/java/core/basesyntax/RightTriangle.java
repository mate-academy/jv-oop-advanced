package core.basesyntax;

public class RightTriangle extends Figure {
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
        return "Figure: rightTriangle, area: " + getArea()
                + " sq.units, side: "
                + String.valueOf(side) + " units, color: "
                + getColor();
    }
}
