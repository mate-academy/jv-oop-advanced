package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int parallelSideA;
    private int parallelSideB;
    private int height;

    public IsoscelesTrapezoid(int parallelSideA, int parallelSideB, int height) {
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
        this.height = height;
    }

    public int getParallelSideA() {
        return parallelSideA;
    }

    public int getParallelSideB() {
        return parallelSideB;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (double) ((parallelSideA + parallelSideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.centimeters, parallelSideA: "
                + getParallelSideA() + ", parallelSideB: " + getParallelSideB() + ", height: "
                + getHeight() + ", color: " + getColor());
    }
}
