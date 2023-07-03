package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int FIGURE_AREA_CONSTANT = 2;

    private final FigureType figureName;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.figureName = FigureType.RIGHT_TRIANGLE;
    }

    @Override
    public double calculateFigureArea() {
        return (firstLeg * secondLeg) / FIGURE_AREA_CONSTANT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + calculateFigureArea() + " sq.unit, side: "
                + "firstLeg " + firstLeg + " units, "
                + "secondLeg " + secondLeg + " units, "
                + "color: " + getColor());
    }
}
