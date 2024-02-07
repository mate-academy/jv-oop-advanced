package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double topBase,
                              double bottomBase, double height) {
        super(name, color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
        public double calculateArea() {
        return (topBase + bottomBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                      + ", area: " + new DecimalFormat(ROUNDING_PATTERN).format(calculateArea())
                      + " sq.units, " + " tob base: " + topBase + " units,"
                      + " bottom base: " + bottomBase + " units,"
                      + " height: " + bottomBase + " units,"
                      + " color: " + getColor());
    }
}
