package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        String string = String.format("Figure: RightTriangle, area: %,.2f sq. units,"
                + " first leg: %d units, second leg: %d units "
                + "color: %s", getArea(), firstLeg, secondLeg, getColor());
        System.out.println(string);
    }
}
