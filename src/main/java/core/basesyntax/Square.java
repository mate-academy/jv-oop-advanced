package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure - square, area = " + String.format("%1f", getArea()).replace(",", ".")
                + " sq.units, side = " + side + " units, color - " + getColor();
    }
}
