package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s\nArea: %.2f\nFirst leg: %d\nSecond leg: %d\nColor: %s\n\n",
                getClass().getSimpleName(), getArea(), firstLeg, secondLeg, getColor());
    }
}
