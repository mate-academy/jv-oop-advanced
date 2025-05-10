package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int lowerSide, int topSide, int height) {
        super(color);
        this.lowerSide = lowerSide;
        this.topSide = topSide;
        this.height = height;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public int getTopSide() {
        return topSide;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowerSide + topSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, color: " + getColor() + ", "
                + "area: " + getArea() + " sq.units, "
                + "lower side: " + lowerSide + ", "
                + "top side: " + topSide + ", "
                + "height: " + height);
    }
}
