package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Color;
import core.basesyntax.Drawable;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private double upperBase;
    private double lowerBase;
    private double height;
    private Color color;

    public IsoscelesTrapezoid(Color color, double upperBase, double lowerBase, double height) {
        this.color = color;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq. units, upper base: " + upperBase + " units, lower base: "
                + lowerBase + " units, height: " + height + " units, color: " + color);
    }
}
