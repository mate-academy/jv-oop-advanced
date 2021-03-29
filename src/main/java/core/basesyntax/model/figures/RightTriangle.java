package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double legA;
    private double legB;

    public RightTriangle() {

    }

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
        setIdentification("right triangle");
    }

    public void setLegA(double legA) {
        this.legA = legA;
    }

    public void setLegB(double legB) {
        this.legB = legB;
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    public double hypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, hypotenuse: " + hypotenuse() + "sq. units, legA: "
                + getLegA() + " units, legB: "
                + getLegB() + "units, color: " + getColor());
    }

    @Override
    public double area() {
        return (legA * legB) / 2;
    }

    @Override
    public Figure getFigure() {
        return new RightTriangle(Math.random() * 50, Math.random() * 50);
    }
}
