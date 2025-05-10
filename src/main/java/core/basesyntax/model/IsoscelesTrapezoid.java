package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final double figureTopSide;
    private final double figureBottomSide;
    private final double figureHeight;

    public IsoscelesTrapezoid(double figureTopSide, double figureBottomSide,
                              double figureHeight, String color) {
        this.figureTopSide = figureTopSide;
        this.figureBottomSide = figureBottomSide;
        this.figureHeight = figureHeight;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((figureBottomSide + figureTopSide) / 2) * figureHeight;
    }

    @Override
    public void draw() {
        System.out.format("Figure: IsoscelesTrapezoid, area: %.1f sq. units,"
                        + "bottom side: %.1f sq. units, top side: %.1f sq. units,"
                        + "height: %.1f sq. units, color: %s \n",
                getArea(),figureBottomSide,figureTopSide, figureHeight, getColor());
    }
}
