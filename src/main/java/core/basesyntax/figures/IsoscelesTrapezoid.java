package core.basesyntax.figures;

import core.basesyntax.FigureTypes;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;
    private double area;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        this.area = ((this.firstSide + this.secondSide) / 2) * this.height;
        return this.area;
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + FigureTypes.ISOSCELES_TRAPEZOID + ", "
                + "area: " + this.area + " sq.units, "
                + "first side: " + this.firstSide + " units, "
                + "second side: " + this.secondSide + " units, "
                + "height: " + this.height + " units, "
                + "color:" + this.color);
    }
}
