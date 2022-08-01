package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side;
    }

    @Override
    public String draw() {
        return "Figure: Square, " + "square=" + getArea() + "sq.units, side=" + side
                + "units, color=" + getColor() + '.';
    }
}

