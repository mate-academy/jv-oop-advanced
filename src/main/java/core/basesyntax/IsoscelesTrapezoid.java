package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lateralSide;
    private double upperBase;
    private double bottomBase;
    private double height;
    private double triangleLeg;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double upperBase, double bottomBase, double lateralSide) {
        this.typeOfFigure = TypeOfFigure.ISOSCELES_TRAPEZOID;
        this.area = calculateArea(upperBase, bottomBase, triangleLeg, height);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.lateralSide = lateralSide;
        this.triangleLeg = (bottomBase - upperBase) / 2;
        this.height = getTrapezoidHigh(lateralSide, triangleLeg);
    }

    public double getTrapezoidHigh(double lateralSide, double triangleLeg) {
        return Math.sqrt(Math.pow(lateralSide, 2) - Math.pow(triangleLeg, 2)); //Pythagorean theorem
    }

    public double calculateArea(double upperBase, double bottomBase,
                                double triangleLeg, double height) {
        double quadrangularArea = getQuadrangularArea(upperBase, height);
        double triangleArea = getTriangleArea(triangleLeg, height);
        return quadrangularArea + triangleArea * 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + typeOfFigure
                + ", area: " + decimalFormat.format(area) + " sq. units, upper base: "
                + decimalFormat.format(upperBase) + " units, bottom base: "
                + decimalFormat.format(bottomBase) + " units, lateral side: "
                + decimalFormat.format(lateralSide) + " units, height: "
                + decimalFormat.format(height) + " units, color: " + color);
    }
}
