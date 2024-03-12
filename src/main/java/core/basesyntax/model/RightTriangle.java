package core.basesyntax.model;

public class RightTriangle extends Figure {
    private double figureFirstLeg;
    private double figureSecondLeg;

    @Override
    public double getArea() {
        return (figureFirstLeg * figureSecondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.format("Figure: Right triangle, area: %.1f sq. units, "
                        + "first leg: %.1f sq. units, second leg: %.1f, color: %s \n",
                getArea(), figureFirstLeg, figureSecondLeg, getColor());
    }

    public void setFigureFirstLeg(double figureFirstLeg) {
        this.figureFirstLeg = figureFirstLeg;
    }

    public void setFigureSecondLeg(double figureSecondLeg) {
        this.figureSecondLeg = figureSecondLeg;
    }
}
