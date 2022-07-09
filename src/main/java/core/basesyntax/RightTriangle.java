package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {

        return (int) (0.5 * (firstLeg * secondLeg));
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle; area: " + getArea() + " square units;"
                + " first leg: " + firstLeg + " units; "
                + "second leg: " + secondLeg + " units; "
                + getColor());
    }
}
