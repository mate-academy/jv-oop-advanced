package core.basesyntax.figures;

import core.basesyntax.util.Figure;

public class IsoscelesTrapezoid extends Figure {
    private Double firstParallelSide;
    private Double secondParallelSide;
    private Double height;

    public IsoscelesTrapezoid() {
    }

    @Override
    public double getArea() {
        return ((getFirstParallelSide() + getSecondParallelSide()) * getHeight() / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + ", firstParallelSide: " + getFirstParallelSide() + ", secondParallelSide = "
                + getSecondParallelSide() + ", height = " + getHeight() + ", color: " + getColor());
    }

    public Double getFirstParallelSide() {
        return firstParallelSide;
    }

    public void setFirstParallelSide(Double firstParallelSide) {
        this.firstParallelSide = firstParallelSide;
    }

    public Double getSecondParallelSide() {
        return secondParallelSide;
    }

    public void setSecondParallelSide(Double secondParallelSide) {
        this.secondParallelSide = secondParallelSide;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
