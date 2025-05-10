package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private int shortSide;
    private int longSide;

    public Rectangle(String color, int shortSide, int longSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return Double.parseDouble(new DecimalFormat("##.##").format((long) shortSide * longSide));
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, short side: "
                + shortSide + " units, long side: " + longSide + " units, color: " + getColor());
    }
}
