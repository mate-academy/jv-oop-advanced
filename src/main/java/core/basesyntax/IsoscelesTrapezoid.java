package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Draw {
    private int parallelSideA;
    private int parallelSideB;
    private int height;

    public IsoscelesTrapezoid() {

    }

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
    public int getArea() {
        return ((this.parallelSideA + this.parallelSideB) / 2) * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.centimeters, parallelSideA: "
                + getParallelSideA() + ", parallelSideB: " + getParallelSideB() + ", height: "
                + getHeight() + ", color: " + getColor());
    }
}
