package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public Double areaOfFigure() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Isosceles Trapezoid, color: " + getColor()
                + ", top side: " + topSide
                + " units, bottom side: " + bottomSide + " units, height: " + height
                + " units, area: " + areaOfFigure() + " sq.units");
    }
}
