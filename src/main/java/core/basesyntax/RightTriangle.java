package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double area = 0.5 * firstLeg * secondLeg;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String formattedArea = decimalFormat.format(area).replace(',', '.');
        return Double.parseDouble(formattedArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, "
                + "first leg: " + firstLeg + " units, second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
