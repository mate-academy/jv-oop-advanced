package core.basesyntax.figuretypes;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double longerBase;
    private double shorterBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double longerBase, double shorterBase, double height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (longerBase + shorterBase) / 2 * height;
        return Math.round(area * DECIMAL_FORMAT) / DECIMAL_FORMAT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + calculateArea() + " units, "
                + "longerBase: " + longerBase + " units, "
                + "shorterBase: " + shorterBase + " units, "
                + "color: " + color);
    }
}
