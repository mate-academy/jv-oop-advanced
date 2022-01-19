package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int parallelSide1;
    private int parallelSide2;

    public IsoscelesTrapezoid(String color, int parallelSide1, int parallelSide2, int height) {
        super(color);
        this.height = height;
        this.parallelSide1 = parallelSide1;
        this.parallelSide2 = parallelSide2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getParallelSide1() {
        return parallelSide1;
    }

    public void setParallelSide1(int parallelSide1) {
        this.parallelSide1 = parallelSide1;
    }

    public int getParallelSide2() {
        return parallelSide2;
    }

    public void setParallelSide2(int parallelSide2) {
        this.parallelSide2 = parallelSide2;
    }

    @Override
    public double getArea() {
        return (parallelSide1 + parallelSide2) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, 1-t parallel side: " + parallelSide1 + ", 2-d parallel side: "
                + parallelSide2 + ", height: " + height + ", color: " + getColor().toLowerCase());
    }
}
