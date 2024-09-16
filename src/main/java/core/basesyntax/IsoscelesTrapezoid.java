package core.basesyntax;

import core.basesyntax.model.Figure;

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
    public double getArea() {
        return (height * 0.5) * (topSide + bottomSide);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure is isoscelesTrapezoid: color - " + getColor()
                + ", topSide/bottomSide length - " + topSide + "/" + bottomSide
                + ", area - " + getArea());
    }
}
