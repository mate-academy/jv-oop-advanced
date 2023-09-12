package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.1f", calculateArea())
                + " sq.units, side: " + side
                + " units, color: " + this.getColor());
    }
}
