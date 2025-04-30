package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int DEFAULT_LEG = 2;
    private static final String DEFAULT_DRAW_MESSAGE =
            "Figure: %s, area: %s sq.units, firstLeg: %s units, secondLeg: %s units, color: %s";

    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        setFigure(FigureType.RIGHT_TRIANGLE);
        setFirstLeg(firstLeg);
        setSecondLeg(secondLeg);
        setColor(color);
        double area = getCalculatedArea();
        setArea(area);
    }

    @Override
    public double getCalculatedArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void drawDetails() {

        System.out.println(
                String.format(
                        DEFAULT_DRAW_MESSAGE,
                        getFigure().toLowerCase(),
                        getArea(),
                        getFirstLeg(),
                        getSecondLeg(),
                        getColor().toString().toLowerCase())
        );
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }
}
