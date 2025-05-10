package core.basesyntax;

import core.basesyntax.enums.FigureType;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(String color,
                              double firstLeg,
                              double secondLeg,
                              double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.ISOSCELES_TRAPEZOID.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, firstLeg: "
                + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, height: "
                + this.height + " units, colors: " + getColor());
    }
}
