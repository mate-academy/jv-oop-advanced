package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int shortSide;
    private int longSide;
    private int height;

    public IsoscelesTrapezoid(String color, int shortSide, int longSide, int height) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea() + " sq.units, short side: "
                + shortSide + " units, long side: " + longSide + " units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Double.parseDouble(new DecimalFormat("##.##")
                .format((long) (longSide + shortSide) / 2 * height));
    }
}
