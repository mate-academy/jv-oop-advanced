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
    public String drawing() {
        return " Figure: square, area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
