package core.basesyntax;

public class Square extends Figure {
    private int squareSide;

    public Square(Color color, int squareSide) {
        super(color);
        this.squareSide = squareSide;
    }

    @Override
    public double getArea() {
        return (double) squareSide * squareSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + squareSide
                + " units, color: " + getColor().name());
    }
}
