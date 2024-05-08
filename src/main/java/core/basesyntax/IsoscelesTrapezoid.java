package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int height;

    public String getName() {
        return "isosceles trapezoid";
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
}
