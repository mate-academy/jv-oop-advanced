package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double area;
    private double upperBase;
    private double lowerBase;
    private double height;

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public double heightCalculator() {
        return height = (upperBase + lowerBase) / 2;
    }

    public double areaCalculator() {
        return area = ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq. units, upper base: "
                + getUpperBase() + " units, lower base"
                + getLowerBase() + " units, height: "
                + getHeight() + " units, color: "
                + getColor();
    }
}
