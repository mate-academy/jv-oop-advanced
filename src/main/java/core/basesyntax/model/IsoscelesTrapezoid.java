package core.basesyntax.model;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.0");
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Double.parseDouble(DECIMAL_FORMAT.format((upperBase + lowerBase) / 2 * height));
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: isosceles trapezoid, area: ")
                .append(getArea()).append(" sq.units, upper base: ").append(upperBase)
                .append(" units, lower base: ").append(lowerBase)
                .append(" units, height: ").append(height)
                .append(" units, color: ").append(getColor().toLowerCase()));
    }
}
