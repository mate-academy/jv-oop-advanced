package core.basesyntax.figure.core;

public class RightTriangle extends Figure {
    private double hypotenuse;
    private double legA;
    private double legB;

    public RightTriangle(String colorOfFigure, double legA, double legB) {
        super(colorOfFigure);
        this.hypotenuse = Math.sqrt((legA * legA) + (legB * legB));
        this.legA = legA;
        this.legB = legB;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getLegA() {
        return legA;
    }

    public void setLegA(double legA) {
        this.legA = legA;
    }

    public double getLegB() {
        return legB;
    }

    public void setLegB(double legB) {
        this.legB = legB;
    }

    @Override
    public double obtainTheArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + obtainTheArea()
                + " sq.units, leg A: " + getLegA() + " units, leg B: " + getLegB()
                + " units, hypotenuse: " + getHypotenuse() + " units, color: "
                + getColorOfFigure());
    }
}
