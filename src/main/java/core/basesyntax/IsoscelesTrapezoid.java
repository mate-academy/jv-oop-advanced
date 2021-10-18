package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int parallelSideA;
    private int parallelSideB;

    public IsoscelesTrapezoid(String color, int height, int parallelSideA, int parallelSideB) {
        super(color);
        this.height = height;
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getParallelSideA() {
        return parallelSideA;
    }

    public void setParallelSideA(int parallelSideA) {
        this.parallelSideA = parallelSideA;
    }

    public int getParallelSideB() {
        return parallelSideB;
    }

    public void setParallelSideB(int parallelSideB) {
        this.parallelSideB = parallelSideB;
    }

    @Override
    public double getArea() {
        return (parallelSideA + parallelSideB) / 2 * height;
    }

    @Override
    public String getInformation() {
        return "Figure: isosceles trapezoid, area: " + new DecimalFormat("#.##").format(getArea())
                + " sq.units, height: " + height + " units, parallel sides "
                + parallelSideB + " units and " + parallelSideA + " units, color: " + getColor();
    }
}
