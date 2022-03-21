package core.basesyntax.modul;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.firstSide + this.secondSide) / 2 * this.height;
    }

    @Override
    public void toDraw(double area) {
        System.out.println("Figure: rectangle"
                + ", area: " + area
                + ", first side: " + this.firstSide
                + ", second side: " + this.secondSide
                + ", height: " + this.height
                + ", color: " + getColor());
    }
}
