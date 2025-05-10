package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int parallelSideA;
    private int parallelSideB;
    private int height;

    public IsoscelesTrapezoid(int parallelSideA, int parallelSideB, int height, String color) {
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
        this.height = height;
        setColor(color);
    }

    public void setParallelSideA(int parallelSideA) {
        this.parallelSideA = parallelSideA;
    }

    public void setParallelSideB(int parallelSideB) {
        this.parallelSideB = parallelSideB;
    }

    public void setHeight(int height) {
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
        return 0.5 * height * (parallelSideA + parallelSideB);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "parallel side A: " + getParallelSideA() + " units, "
                + "parallel side B: " + getParallelSideB() + " units, "
                + "height: " + getHeight() + " units, color: " + getColor());
    }
}
