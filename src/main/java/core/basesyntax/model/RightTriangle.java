package basesyntax.model;

import core.basesyntax.service.AreaCalculator;

public class RightTriangle extends Figure implements AreaCalculator {

    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return getFirstLeg() * getSecondLeg() / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units, "
                + "firstLeg " + getFirstLeg() + " units, "
                + "secondleg " + getSecondLeg() + " units, "
                + "color: " + getColor().toLowerCase());
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
