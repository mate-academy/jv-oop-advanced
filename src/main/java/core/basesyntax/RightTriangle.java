package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %f, "
                        + "firstLeg: %f, secondLeg: %f, color: %s\n",
                getArea(),
                firstLeg,
                secondLeg,
                color
        );
    }

    @Override
    public double getArea() {
        return ((firstLeg * secondLeg) / 2);
    }
}
