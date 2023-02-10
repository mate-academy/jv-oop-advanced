package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
