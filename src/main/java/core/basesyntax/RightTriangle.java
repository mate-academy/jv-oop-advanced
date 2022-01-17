package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round((firstLeg * secondLeg) / 2.0);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + ", second leg: " + secondLeg
                + " units, color: " + getColor().toLowerCase());
    }
}
