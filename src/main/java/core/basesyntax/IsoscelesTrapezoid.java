package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lateralSide;
    private double upperBase;
    private double bottomBase;
    private double triangleLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase,
                              double bottomBase, double lateralSide) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.lateralSide = lateralSide;
        calculateDimensions();
    }

    private void calculateDimensions() {
        triangleLeg = (bottomBase - upperBase) / 2;
        height = calculateTrapezoidHeight(lateralSide, triangleLeg);
    }

    private double calculateTrapezoidHeight(double lateralSide, double triangleLeg) {
        return Math.sqrt(Math.pow(lateralSide, 2) - Math.pow(triangleLeg, 2)); //Pythagorean theorem
    }

    @Override
    public double calculateArea() {
        return upperBase * height + triangleLeg * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + decimalFormat.format(calculateArea()) + " sq. units, upper base: "
                + decimalFormat.format(upperBase) + " units, bottom base: "
                + decimalFormat.format(bottomBase) + " units, lateral side: "
                + decimalFormat.format(lateralSide) + " units, height: "
                + decimalFormat.format(height) + " units, color: " + color);
    }
}
