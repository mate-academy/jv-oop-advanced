package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    public IsoscelesTrapezoid(){}

    public IsoscelesTrapezoid(int getParallelSideA,int getParallelSideB, int getHeight, Color color) {
    }

    @Override
    public double getArea() {
        return (getParallelSideA() + getParallelSideB()) / 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new IsoscelesTrapezoid()
                + "area: " + new IsoscelesTrapezoid().getArea() + " sq.units"
                + "side: " + getParallelSideB() + "," + getParallelSideA() + "units"
                + "color: " + colorSupplier.getRandomColor());
    }
}
