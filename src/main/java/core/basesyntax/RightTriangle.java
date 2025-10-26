package core.basesyntax;

public class RightTriangle extends Figure {
    private final String name = FigureName.TRIANGLE.name().toLowerCase();
    private final double firstLeg;
    private final double secondLeg;

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
    public void draw() {
        System.out.println("Figure: " + name + " area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + " secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
