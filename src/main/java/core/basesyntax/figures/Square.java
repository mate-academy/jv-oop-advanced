package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + getArea() + " sq.units, side: "
                + getSide() + " units, color: "
                + getColor();
    }
}
