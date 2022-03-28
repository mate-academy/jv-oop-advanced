package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public int getTopSide() {
        return topSide;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double areaCount(int topSide, int bottomSide, int height) {
        return ((topSide + bottomSide) * 0.5) * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + areaCount(topSide, bottomSide, height)
                + " sq.units, top side: " + topSide + " bottom side: " + bottomSide
                + " height: " + height + " units, color: " + getColor();
    }

}
