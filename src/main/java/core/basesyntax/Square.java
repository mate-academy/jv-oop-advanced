package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
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
