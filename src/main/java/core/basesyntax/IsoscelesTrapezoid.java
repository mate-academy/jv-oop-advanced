package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = 0.5 * (upperBase + lowerBase) * height;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String formattedArea = decimalFormat.format(area).replace(',', '.');
        return Double.parseDouble(formattedArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, "
                + "upper base: " + upperBase + " units, lower base: " + lowerBase + " units, "
                + "height: " + height + " units, color: " + getColor());
    }
}
