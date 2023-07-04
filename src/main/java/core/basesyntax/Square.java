package core.basesyntax;

public class Square extends Figure {
    private final int squareSide;

    public Square(Color color, int squareSide) {
        super(color);
        this.squareSide = squareSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Square; area : " + getArea() + " sq.units, "
                + " square side : " + squareSide + " units, "
                + " color : " + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(squareSide, 2);
    }
}
