package core.basesyntax.model;

public class Square extends Figure {
    private double figureSideSize;

    @Override
    public double getArea() {
        return figureSideSize * figureSideSize;
    }

    @Override
    public void draw() {
        System.out.format("Figure: Square, area: %.1f sq. units, "
                        + "side size: %.1f sq. units, color: %s \n",
                getArea(), figureSideSize, getColor());
    }

    public void setFigureSideSize(double figureSideSize) {
        this.figureSideSize = figureSideSize;
    }
}
