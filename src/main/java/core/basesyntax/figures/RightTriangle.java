package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String colorSupplier, double firstLeg, double secondLeg) {
        super(colorSupplier);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                    + String.format("%.2f", calculateArea())
                    + " sq.units, firstLeg: "
                    + String.format("%.2f", firstLeg)
                    + " units, secondLeg: "
                    + String.format("%.2f", secondLeg)
                    + " units, color: " + getColor());
    }
}
