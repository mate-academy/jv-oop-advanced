package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
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

    @Override
    public double getArea() {
        return (topSide * bottomSide / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid, area: " + getArea()
                + " sq.units, topSide: " + topSide + ", bottomSide: "
                + bottomSide + ", height: " + height + ", color: " + getColor());
    }
}
