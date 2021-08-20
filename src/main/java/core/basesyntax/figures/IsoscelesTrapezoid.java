package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int bottomSide;
    private int topSide;

    public IsoscelesTrapezoid(String color,int height, int bottomSide, int topSide) {
        super(color);
        this.height = height;
        this.bottomSide = bottomSide;
        this.topSide = topSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, height: "
                + getHeight() + " units," + " bottomSide: " + getBottomSide()
                + " units," + " topSide: " + getTopSide() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (double) ((bottomSide + topSide) / 2) * height;
    }
}
