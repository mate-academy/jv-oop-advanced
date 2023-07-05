package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;
    private int topSide;
    private double area;

    public IsoscelesTrapezoid(String name, Color color, int baseSide, int topSide) {
        super(name, color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        resultArea();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public int getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(int baseSide) {
        this.baseSide = baseSide;
    }

    public int getTopSides() {
        return topSide;
    }

    public void setTopSides(int topSides) {
        this.topSide = topSides;
    }

    public void resultArea() {
        setArea(
                (1 / 2)
                * getBaseSide()
                * Math.sqrt((getTopSides() * getTopSides())
                        - ((getBaseSide() * getBaseSide()) / 4))
        );
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + getArea() + " sq.units"
                + ", base: " + getBaseSide() + " units, "
                + "side: " + getTopSides() + " units, "
                + "color: " + getColor().name());
    }
}
