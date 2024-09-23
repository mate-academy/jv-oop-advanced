package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final ColorSupplier colorsupplier = new ColorSupplier();

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq"
                + ", firstLeg " + firstLeg + " units "
                + ", second leg: " + secondLeg + " units "
                + " color: " + colorsupplier.getRandomColor());
    }
}
