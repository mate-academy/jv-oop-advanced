package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements GetArea {
    private double topSide;
    private double bottomSide;
    private double height;

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public String printInfo() {
        return "Figure: isosceles trapezoid, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, top side: " + getTopSide() + " units, bottom side: " + getBottomSide()
                + " units, height: " + getHeight() + ", color: " + getColor();
    }
}
