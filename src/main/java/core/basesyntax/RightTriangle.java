package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", color=" + getColor() + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle"
                + ", area=" + this.calculateArea() + " sq.units"
                + " firstLeg=" + firstLeg + " units"
                + ", secondLeg=" + secondLeg + " units"
                + ", color=" + getColor());
    }
}
