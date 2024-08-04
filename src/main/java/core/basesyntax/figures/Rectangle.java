package core.basesyntax.figures;

import java.util.Locale;

public class Rectangle extends Figure {
    private double topSide;
    private double lateralSide;
    private double area;

    public Rectangle(String color, double topSide, double lateralSide) {
        super(color);
        this.topSide = topSide;
        this.lateralSide = lateralSide;
        this.area = calculateArea();
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
        this.area = calculateArea();
    }

    public double getLateralSide() {
        return lateralSide;
    }

    public void setLateralSide(double lateralSide) {
        this.lateralSide = lateralSide;
        this.area = calculateArea();
    }

    public double getArea() {
        return area;
    }

    @Override
    protected double calculateArea() {
        return topSide * lateralSide;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US, "Figure: rectangle, area: %.1f sq. units, "
                        + "top-side: %.1f units, "
                        + "lateral-side: %.1f units, "
                        + "color: %s\n",
                area, topSide, lateralSide, color);
    }
}
