package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int parallelSideA;
    private int parallelSideB;
    private int height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int parallelSideA, int parallelSideB, int getHeight, String color) {
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (parallelSideA + parallelSideB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + getClass().getSimpleName()
                + "area: " + this.getArea() + " sq.units"
                + "side: " + parallelSideA + "," + parallelSideB + "units"
                + "color: " + this.color);
    }
}
