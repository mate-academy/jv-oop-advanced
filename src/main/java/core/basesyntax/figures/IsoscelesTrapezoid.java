package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private double sideOne;
    private double sideTwo;
    private double heigh;

    public IsoscelesTrapezoid(Color color, double sideOne, double sideTwo, double heigh) {
        super.setColor(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.heigh = heigh;
    }

    @Override
    public double getArea() {
        return ((sideOne + sideTwo) / 2) * heigh;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq.units, parallelSideOne: " + sideOne
                + " units, parallelSideTwo: " + sideTwo
                + " units, heigh: " + heigh
                + " units, color: " + getColor().name().toLowerCase());
    }
}
