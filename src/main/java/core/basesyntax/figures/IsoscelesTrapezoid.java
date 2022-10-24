package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private final String name = "isosceles_trapezoid";
    private double SideOne;
    private double SideTwo;
    private double heigh;

    public IsoscelesTrapezoid(Color color, double SideOne, double SideTwo, double heigh) {
        super.setColor(color);
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.heigh = heigh;
    }

    @Override
    public double getArea() {
        return ((SideOne + SideTwo) / 2) * heigh;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", area: " + getArea()
                + " sq.units, parallelSideOne: " + SideOne
                + " units, parallelSideTwo: " + SideTwo
                + " units, heigh: " + heigh
                + " units, color: " + getColor().name().toLowerCase());
    }
}
