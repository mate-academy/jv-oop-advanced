package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int lowerSide;
    private double height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int upperSide, int lowerSide) {
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public double getHeight() {
        return height;
    }

    public double calculateHeight() {
        return 2 * getArea() / (upperSide + lowerSide);
    }

    @Override
    public double calculateArea() {
        double area = Math.sqrt(upperSide + lowerSide) + (upperSide + lowerSide) / 2;
        setArea(area);
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + calculateArea()
                + " sq. units, height: " + calculateHeight()
                + " units, color: " + getColor());
    }
}
