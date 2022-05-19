package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color, FigureType.TRIANGLE);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg / secondLeg) * 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %f, color = %s, firstLeg = %f, secondLeg = %f\n",
                getFigureType().value, calculateArea(), getColor(), firstLeg, secondLeg);
    }
}
