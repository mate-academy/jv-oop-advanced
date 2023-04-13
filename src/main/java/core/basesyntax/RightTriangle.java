package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    RightTriangle(int firstLeg, int secondLeg, Colors color) {
        super(firstLeg * secondLeg / 2.d, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: "
                + getArea()
                + " sq.units, first leg: "
                + getFirstLeg()
                + " units, second leg: "
                + getSecondLeg()
                + " units, color: "
                + getColor().name().toLowerCase());
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }
}
