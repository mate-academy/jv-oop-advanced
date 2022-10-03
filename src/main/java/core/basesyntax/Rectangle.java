package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private double bigSide;
    private double smallSide;

    public Rectangle(String name, String color, double bigSide, double smallSide) {
        super(name, color);
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    @Override
    public double calculateArea() {
        return bigSide * smallSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + new DecimalFormat(ROUNDING_PATTERN).format(calculateArea())
                + " sq.units," + " big side: " + bigSide + " units,"
                + " small side: " + smallSide + " units,"
                + " color: " + getColor());
    }
}
