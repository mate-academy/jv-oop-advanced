package core.basesyntax.model;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLen) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLen;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }
}
