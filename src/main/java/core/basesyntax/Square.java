package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: " + calculateArea() + " sq.unit, "
                + "side: " + side + " units, "
                + "color: " + getColor().name().toLowerCase();
    }

    @Override
    public double calculateArea() {
        return (int)(side * side * 1000) / 1000.0;
    }
}
