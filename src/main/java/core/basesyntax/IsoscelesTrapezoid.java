package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        setColor(color);
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

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public String printInfo() {
        return "Figure: isosceles trapezoid, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, top side: " + (int) getTopSide()
                + " units, bottom side: " + (int) getBottomSide() + " units, height: "
                + (int) getHeight() + ", color: " + getColor();
    }
}
