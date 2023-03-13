package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int longSide;
    private double height;

    public IsoscelesTrapezoid(String color, int topSide, int longSide, double height) {
        super(color);
        this.topSide = topSide;
        this.longSide = longSide;
        this.height = height;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public double getLongSide() {
        return longSide;
    }

    public void setSide(int longSide) {
        this.longSide = longSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + longSide) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + String.format("%.2f", getArea())
                + " sq.units, trapezoid height: " + getHeight() + " ,sideA: " + getTopSide()
                + " units, sideB: " + getLongSide() + " units, color: " + getColor());
    }
}
