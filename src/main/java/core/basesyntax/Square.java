package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double caclulateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + caclulateArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
