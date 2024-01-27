package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String FIGURE = "right rectangle";
    private int firstLeg;
    private int secondLeg;

    protected RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double findArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String toDraw() {
        return "Figure: " + FIGURE + ", area: " + findArea() + ", first leg: " + this.firstLeg
                + ", second leg: " + this.secondLeg
                + ", color: "
                + this.color;
    }
}
