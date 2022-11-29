package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "right triangle";
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    protected double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    protected String draw() {
        return "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, first leg: " +  firstLeg + " units, second leg: " + secondLeg + " units, color: " + color;
    }
}
