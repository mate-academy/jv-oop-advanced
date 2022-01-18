package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int lowerSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upperSide, int lowerSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return (upperSide + lowerSide) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + obtainArea()
                + " sq.units, upper side: " + upperSide
                + " units, lower side: " + lowerSide
                + " units, height : " + height
                + " units, color: " + getColor());
    }
}
