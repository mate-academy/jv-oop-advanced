package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private static final int DIVISOR = 2;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Colors color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / DIVISOR;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + calculateArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + color.name());
    }
}
