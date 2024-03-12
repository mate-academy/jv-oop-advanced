package core.basesyntax.model;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "Right triangle";
    private double figureFirstLeg;
    private double figureSecondLeg;

    @Override
    public double getArea() {
        return (figureFirstLeg * figureSecondLeg) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.format("Figure: %s, area: %.1f sq. units, "
                        + "first leg: %.1f sq. units, second leg: %.1f, color: %s \n",
                FIGURE_NAME, getArea(), figureFirstLeg, figureSecondLeg, getColor());
    }

    public void setFigureFirstLeg(double figureFirstLeg) {
        this.figureFirstLeg = figureFirstLeg;
    }

    public void setFigureSecondLeg(double figureSecondLeg) {
        this.figureSecondLeg = figureSecondLeg;
    }
}
