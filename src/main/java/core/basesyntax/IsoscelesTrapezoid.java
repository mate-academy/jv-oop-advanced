package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int topSide, int bottomSide, int height) {
        super(color, name);
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
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + (int) getArea() + " sq. units, top side length: " + getTopSide()
                + " units, bottom side length: " + getBottomSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((double) (topSide + bottomSide) / 2) * height;
    }
}
