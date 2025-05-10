package core.basesyntax;

public class Square extends Figure {
    private static final int SQUARED_DEGREE = 2;

    private final double squareSide;
    private final FigureType figureName;

    public Square(Color color, double squareSide) {
        super(color);
        this.squareSide = squareSide;
        this.figureName = FigureType.SQUARE;
    }

    @Override
    public double calculateFigureArea() {
        return Math.pow(squareSide, SQUARED_DEGREE);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + calculateFigureArea() + " sq.unit, "
                + "side: " + squareSide + " units, "
                + "color: " + getColor());
    }
}
