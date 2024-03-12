package core.basesyntax.model;

public class Square extends Figure {
    private static final String FIGURE_NAME = "Square";
    private double figureSideSize;

    @Override
    public double getArea() {
        return figureSideSize * figureSideSize;
    }

    @Override
    public void drawFigure() {
        System.out.format("Figure: %s, area: %.1f sq. units, "
                        + "side size: %.1f sq. units, color: %s \n",
                FIGURE_NAME, getArea(), figureSideSize, getColor());
    }

    public void setFigureSideSize(double figureSideSize) {
        this.figureSideSize = figureSideSize;
    }
}
