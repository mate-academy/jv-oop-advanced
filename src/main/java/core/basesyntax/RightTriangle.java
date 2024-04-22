package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area "
                        + calculateArea()
                        + ", first leg: "
                        + firstLeg
                        + ", second leg "
                        + secondLeg
                        + ", color: "
                        + getColor()
        );
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2.0;
    }
}
