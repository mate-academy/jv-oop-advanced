package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double trapezoidHeight;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide,
                              double trapezoidHeight) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.trapezoidHeight = trapezoidHeight;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(double trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double area() {
        return (firstSide + secondSide) / 2 * trapezoidHeight;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure IsoscelesTrapezoid has area "
                + Math.round(area()) + " and color " + this.getColor());
    }
}
