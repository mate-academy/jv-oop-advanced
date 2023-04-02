package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int parallelSideA;
    private int parallelSideB;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int parallelSideA, int parallelSideB, int getHeight, Color color) {
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
    }

    @Override
    public double getArea() {
        return (parallelSideA + parallelSideB) / 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new IsoscelesTrapezoid()
                + "area: " + new IsoscelesTrapezoid().getArea() + " sq.units"
                + "side: " + parallelSideA + "," + parallelSideB + "units"
                + "color: " + getColorSupplier().getRandomColor());
    }
}
