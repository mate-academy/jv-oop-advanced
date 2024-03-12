package core.basesyntax.model;

public class RightTriangle extends Figure {
    private final double figureFirstLeg;
    private final double figureSecondLeg;

    public RightTriangle(double figureFirstLeg, double figureSecondLeg, String color) {
        this.figureFirstLeg = figureFirstLeg;
        this.figureSecondLeg = figureSecondLeg;
        setColor(color);
    }

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
}
