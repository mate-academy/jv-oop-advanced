package core.basesyntax.figures;

import core.basesyntax.base.Figure;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        double hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
        double halfPerimeter = (hypotenuse + firstLeg + secondLeg) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstLeg) *
                (halfPerimeter - secondLeg) * (halfPerimeter - hypotenuse));
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area()
                + " sq. units, first leg: " + firstLeg + " units," + " second leg: " + secondLeg + " units, color: " + color);
    }
}
