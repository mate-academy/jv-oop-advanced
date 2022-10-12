package core.basesyntax;

public class IsoscelesTrapezoid extends FigureColor {
    private int topSide;
    private int bottomSide;
    private int height;

    public void setIsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.setColor(color);
    }

    public double getArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, topSide: " + topSide
                + " bottomSide: " + bottomSide
                + " height: " + height
                + " units, color: " + getColor());
    }
}
