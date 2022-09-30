package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + " units, color: " + getColor().name().toLowerCase());
    }
}
