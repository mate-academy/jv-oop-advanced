package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.2f", calculateArea())
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor().name());
    }
}
