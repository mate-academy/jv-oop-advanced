package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private final String name = "isosceles_trapezoid";
    private double parallelSideOne;
    private double parallelSideTwo;
    private double heigh;

    public IsoscelesTrapezoid(Color color, double parallelSideOne, double parallelSideTwo, double heigh) {
        super.color = color;
        this.parallelSideOne = parallelSideOne;
        this.parallelSideTwo = parallelSideTwo;
        this.heigh = heigh;
    }

    @Override
    public double getArea() {
        return ((parallelSideOne + parallelSideTwo) / 2) * heigh;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() +
                " sq.units, parallelSideOne: " + parallelSideOne +
                " units, parallelSideTwo: " + parallelSideTwo +
                " units, heigh: " + heigh +
                " units, color: " + color.name().toLowerCase());
    }
}
