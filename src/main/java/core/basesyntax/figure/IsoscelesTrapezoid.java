package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide = 0;
    private int twoSides = 0;
    private double area = 0;

    public IsoscelesTrapezoid(String name, Color color) {
        setName(name);
        setColor(color);
        randomFigure();
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

    public int getTwoSides() {
        return twoSides;
    }

    public void setTwoSides(int twoSides) {
        this.twoSides = twoSides;
    }

    public void resultArea() {
        setArea(
                (1 / 2)
                * getBaseSide()
                * Math.sqrt((getTwoSides() * getTwoSides())
                        - ((getBaseSide() * getBaseSide()) / 4))
        );
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + getArea() + " sq.units"
                + ", base: " + getBaseSide() + " units, "
                + "side: " + getTwoSides() + " units, "
                + "color: " + getColor().name());
    }

    @Override
    public void randomFigure() {
        setBaseSide(randomSideFigure());
        setTwoSides(randomSideFigure());
        resultArea();
    }
}
