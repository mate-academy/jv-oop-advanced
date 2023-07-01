package core.basesyntax;

public class Square extends Figure {
    private final double squareSide;
    private final FigureEnum figureName;

    public Square(String color, double squareSide) {
        super(color);
        this.squareSide = squareSide;
        this.figureName = FigureEnum.SQUARE;
    }

    @Override
    public double getFigureArea() {
        return Math.pow(squareSide, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + getFigureArea() + " sq.unit, "
                + "side: " + squareSide + " units, "
                + "color: " + getColor());
    }
}
