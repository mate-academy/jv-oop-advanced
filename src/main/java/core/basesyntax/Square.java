package core.basesyntax;

public class Square extends Figure {
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
        return "Figure: square, area: " + getArea()
                + " sq.units, side: "
                + String.valueOf(side) + " units, color: "
                + getColor();
    }

}
