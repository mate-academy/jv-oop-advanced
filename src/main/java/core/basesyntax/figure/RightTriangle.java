package core.basesyntax.figure;

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
        System.out.println("RightTriangle{"
                + "area=" + calculateArea()
                + ", firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", color=" + color
                + '}');
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
