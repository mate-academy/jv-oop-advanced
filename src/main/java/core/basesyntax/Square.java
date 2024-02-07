package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return " Figure: square, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor();
    }
}
