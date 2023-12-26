package core.basesyntax;

public abstract class FigureForTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public FigureForTriangle(String color, int firstLeg, int secondLeg) {
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
}
