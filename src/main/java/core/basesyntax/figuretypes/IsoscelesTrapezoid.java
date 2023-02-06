package core.basesyntax.figuretypes;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double longerBase;
    private double shorterBase;
    private double height;

    public IsoscelesTrapezoid(String color, double longerBase, double shorterBase, double height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = (longerBase + shorterBase) / 2 * height;
        return Math.round(area * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " units, "
                + "longerBase: " + longerBase + " units, "
                + "shorterBase: " + shorterBase + " units, "
                + "color: " + color);
    }
}
