package core.basesyntax;

public class RightTriangle extends Figure implements  AreaCalculator, Drawable {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getLeg1() {
        return firstLeg;
    }

    public double getLeg2() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round(firstLeg * secondLeg / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "right triangle" + ", area: " + getArea() + ", firstLeg: "
                + getLeg1() + ", secondLeg: " + getLeg2() + ", color: " + getColor());
    }
}
