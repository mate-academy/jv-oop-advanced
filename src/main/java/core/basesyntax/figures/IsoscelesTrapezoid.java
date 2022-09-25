package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstline;
    private double secondline;
    private double thirdline;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double firstline,
                              double secondline, double thirdline) {
        this.firstline = firstline;
        this.secondline = secondline;
        this.thirdline = thirdline;
    }

    public IsoscelesTrapezoid(String color,
                              double firstline, double secondline, double thirdline) {
        super(color);
        this.firstline = firstline;
        this.secondline = secondline;
        this.thirdline = thirdline;
    }

    @Override
    public double getArea() {
        return (firstline + secondline) * thirdline / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", color= " + color
                + ", area= " + getArea()
                + " unit sq., Length A=" + firstline
                + " unit sq., Length B= " + secondline + " unit sq."
                + " " + thirdline + " unit sq.");
    }
}
