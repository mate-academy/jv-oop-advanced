package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "figure: square, area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor().toString().toLowerCase();
    }
}
