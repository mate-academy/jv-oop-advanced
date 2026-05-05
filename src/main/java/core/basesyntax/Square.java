package core.basesyntax;

public class Square extends Figure {

    private final int squareSide;

    public Square(Color color, int squareSide) {
        super(color);
        this.squareSide = squareSide;
        setArea(Math.pow(squareSide, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, squareSide: " + squareSide
                + " units, color: " + getColor());
    }

}
