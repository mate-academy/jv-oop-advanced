package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

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
        return (double) ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " + "area: " + getArea() + " sq.units, "
                + "topSide: " + topSide + " units, "
                + "bottomSide: " + bottomSide + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }
}
