package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.type = getClass().getSimpleName();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = ColorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + ", color: " + color);
    }
}
