package core.basesyntax;
public class RightTriangle extends Figure implements AreaCalculator, Drawable {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive");
        }
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + this.area() + " sq. units, first leg: "
                + this.firstLeg + ", second leg: "
                + this.secondLeg + ", color: " + getColor());
    }
}
