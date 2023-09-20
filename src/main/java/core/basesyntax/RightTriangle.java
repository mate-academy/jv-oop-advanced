package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public static RightTriangle createRightTriangle(double firstLeg, double secondLeg,
                                                    String color) {
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    @Override
    public void getArea() {
        double area = 0.5 * firstLeg * secondLeg;
        System.out.println("Figure: right triangle, area: "
                + decimalFormat.format(area) + " sq.units, firstLeg: "
                + decimalFormat.format(firstLeg) + " units, secondLeg: "
                + decimalFormat.format(secondLeg) + " units, color: " + getColor());
    }
}
