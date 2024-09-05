package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lateralSide;
    private double upperBase;
    private double bottomBase;
    private double triangleLeg;
    private double height;

    {
        figureType = FigureType.ISOSCELES_TRAPEZOID;
    }

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double upperBase, double bottomBase, double lateralSide) {
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.lateralSide = lateralSide;
        calculateDimensions();
        calculateArea();
    }

    private void calculateDimensions() {
        triangleLeg = (bottomBase - upperBase) / 2;
        height = calculateTrapezoidHeight(lateralSide, triangleLeg);
    }

    private double calculateTrapezoidHeight(double lateralSide, double triangleLeg) {
        return Math.sqrt(Math.pow(lateralSide, 2) - Math.pow(triangleLeg, 2)); //Pythagorean theorem
    }

    private void calculateArea() {
        double quadrangularArea = calculateQuadrangularArea(upperBase, height);
        double triangleArea = calculateTriangleArea(triangleLeg, height);
        area = quadrangularArea + triangleArea * 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + figureType
                + ", area: " + decimalFormat.format(area) + " sq. units, upper base: "
                + decimalFormat.format(upperBase) + " units, bottom base: "
                + decimalFormat.format(bottomBase) + " units, lateral side: "
                + decimalFormat.format(lateralSide) + " units, height: "
                + decimalFormat.format(height) + " units, color: " + color);
    }
}
