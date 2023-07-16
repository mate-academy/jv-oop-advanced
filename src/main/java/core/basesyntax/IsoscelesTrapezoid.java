package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;
    private String color;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int height) {
        this.color = color;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getArea() {
        return (topSide + bottomSide) * height / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units, topSide: "
                + topSide + " units, bottomSide: " + bottomSide + " units, height: " + height
                + " units, color: " + color);
    }
}
