package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: " + area + " sq.unit, "
                + "side: " + side + " units, "
                + "color: " + color.name().toLowerCase();
    }
}
