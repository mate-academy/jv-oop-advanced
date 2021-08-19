package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, String figure, int firstLeg, int secondLeg) {
        super(color, figure);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public String draw() {
        return "Figure " + getType() + ", area " + getArea() + " sq.u., firstLeg "
                + firstLeg + " and secondLeg " + secondLeg + " u., color " + getColor();
    }
}
