package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "RightTriangle{"
                + "area=" + getArea()
                + ", firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", color=" + getColor().name() + '}';
    }
}
