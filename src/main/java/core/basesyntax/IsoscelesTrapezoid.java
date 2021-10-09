package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int side;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int side, int height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.side = side;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTopSide(int topSide) {
        this.topSide = topSide;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    public int getTopSide() {
        return topSide;
    }

    public int getSide() {
        return side;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * (getBottomSide() + getTopSide()) * getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area "
                + getArea() + " sq.units," + "top side: "
                + getTopSide() + " units," + " bottom side: "
                + getBottomSide() + " units," + " side:"
                + getSide() + ", height: " + getHeight()
                + " color: " + getColor());
    }
}
