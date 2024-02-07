package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int lateralSide;

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

    public int getLateralSide() {
        return lateralSide;
    }

    public void setLateralSide(int lateralSide) {
        this.lateralSide = lateralSide;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * lateralSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, top side: "
                + topSide + " sq.units, bottom side: " + bottomSide + " sq.units, lateral side: "
                + lateralSide + " color: " + getColor());
    }
}
