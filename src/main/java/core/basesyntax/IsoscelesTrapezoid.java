package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int parallelSideA;
    private int parallelSideB;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public IsoscelesTrapezoid() {
    }

    @Override
    public double getArea() {
        return (parallelSideA + parallelSideB) / 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new IsoscelesTrapezoid()
                + "area: " + new IsoscelesTrapezoid().getArea() + " sq.units"
                + "side: " + parallelSideB + "," + parallelSideA + "units"
                + "color: " + colorSupplier.getRandomColor());
    }
}
