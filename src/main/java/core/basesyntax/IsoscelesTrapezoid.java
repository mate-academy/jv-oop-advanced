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

    public void calculateHeight() {
        height = 2 * getArea() / (upperSide + lowerSide);
    }

    @Override
    public void doAllCalculations() {
        calculateArea();
        calculateHeight();
    }

    @Override
    public void calculateArea() {
        setArea(Math.sqrt(upperSide + lowerSide) + (upperSide + lowerSide) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + Math.round(getArea())
                + " sq. units, height: " + Math.round(height)
                + " units, color: " + getColor());
    }
}
