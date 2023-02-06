package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final NameOfFigure name = NameOfFigure.TRIANGLE;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public NameOfFigure getName() {
        return name;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    @Override
    public int areaCalculator() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + areaCalculator() + " sq.units, firstLeg: "
                + getFirstLeg() + " secondLeg " + getSecondLeg() + " units, color: " + getColor());
    }
}
