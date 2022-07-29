package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double basisA;
    private double basisB;
    private double height;
    private double area;

    public void setBasisA(double basisA) {
        this.basisA = basisA;
    }

    public void setBasisB(double basisB) {
        this.basisB = basisB;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void getArea() {
        area = basisA + basisB / 2 * height;
    }

    @Override
    public void draw() {
        getArea();
        System.out.println("Isosceles trapezoid, area: " + area + ", basisA: " + basisA
                + ", basisB: " + basisB + ", height: " + height + ", color: " + getColor());
    }
}
