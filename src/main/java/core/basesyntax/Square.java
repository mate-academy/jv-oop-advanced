package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }

    @Override
    public String drawing() {
        return " Figure: square, area: " + getFigureArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor();
    }
}
