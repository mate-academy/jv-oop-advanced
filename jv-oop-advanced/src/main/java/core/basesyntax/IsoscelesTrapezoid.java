package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        this.color = color;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topSide + bottomSide) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, topSide: " + getTopSide() + " units, bottomSide: "
                + getBottomSide() + " units, height: " + getHeight()
                + " units, color: " + color);
    }

    public double getTopSide() {
        return topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public double getHeight() {
        return height;
    }
}
