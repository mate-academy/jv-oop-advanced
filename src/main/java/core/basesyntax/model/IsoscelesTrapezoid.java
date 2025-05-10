package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int height) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
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
        return (double) (topSide * height + bottomSide * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, topSide: " + getTopSide() + " units, bottomSide: "
                + getBottomSide() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
