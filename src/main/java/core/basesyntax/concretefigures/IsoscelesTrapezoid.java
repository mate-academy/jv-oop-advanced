package core.basesyntax.concretefigures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double wideBase;
    private double narrowBase;
    private double height;

    public IsoscelesTrapezoid(String color, double wideBase, double narrowBase, double height) {
        super(color);
        this.wideBase = wideBase;
        this.narrowBase = narrowBase;
        this.height = height;
    }

    public double getWideBase() {
        return wideBase;
    }

    public void setWideBase(double wideBase) {
        this.wideBase = wideBase;
    }

    public double getNarrowBase() {
        return narrowBase;
    }

    public void setNarrowBase(double narrowBase) {
        this.narrowBase = narrowBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (wideBase + narrowBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " units, wideBase: " + getWideBase()
                + " units, narrowBase: " + getNarrowBase()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
