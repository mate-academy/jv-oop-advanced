package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomSide;
    private final int topSide;
    private final int height;

    public IsoscelesTrapezoid(int bottomSide, int topSide, int height) {
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) (bottomSide + topSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName()
                + ", area: " + calculateArea()
                + " sq. units, bottom side: " + getBottomSide()
                + " units, top side: " + getTopSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public int getTopSide() {
        return topSide;
    }

    public int getHeight() {
        return height;
    }
}
