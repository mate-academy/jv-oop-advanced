package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + findArea()
                + " sq.units, side: " + this.side
                + " units, color: " + getColor());
    }

    @Override
    public double findArea() {
        return side * side;
    }
}
