package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int topSide;
    private int bottomSide;

    public IsoscelesTrapezoid(int height, int topSide, int bottomSide, String color) {
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.setColor(color);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sc.units,"
                + " top side: " + topSide + " units, bottom side: " + bottomSide + " units,"
                + " height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / 2) * height;
    }
}
