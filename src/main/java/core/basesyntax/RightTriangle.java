package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double calculateArea() {
        return Math.round(firstLeg * secondLeg / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "right triangle" + ", area: " + calculateArea()
                + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + ", color: "
                + getColor());
    }
}
