package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2.0d * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getFormatted(getArea())
                + " sq.units, top side: "
                + getFormatted(getTopSide())
                + " units, bottom side: "
                + getFormatted(getBottomSide())
                + " units, height: "
                + getFormatted(getHeight())
                + " color: "
                + getColor().name().toLowerCase());
    }
}
