package core.basesyntax;

public class RightTriangle extends Figure {
    private final FigureEnum figureName;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.figureName = FigureEnum.RIGHT_TRIANGLE;
    }

    @Override
    public double getFigureArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + getFigureArea() + " sq.unit, side: "
                + "firstLeg " + firstLeg + " units, "
                + "secondLeg " + secondLeg + " units, "
                + "color: " + getColor());
    }
}
