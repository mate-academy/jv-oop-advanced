package basesyntax.model;

import core.basesyntax.service.AreaCalculator;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {

    private final double longerBase;
    private final double shorterBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double longerBase, double shorterBase, double height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (longerBase + shorterBase) * height / 2;
    }


    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units, "
                + "longerbase " + getLongerBase() + " units, "
                + "shoterbase " + getShorterBase() + " units, "
                + "height " + getHeight() + " units, "
                + "color: " + getColor().toLowerCase());
    }

    public double getLongerBase() {
        return longerBase;
    }

    public double getShorterBase() {
        return shorterBase;
    }

    public double getHeight() {
        return height;
    }
}
