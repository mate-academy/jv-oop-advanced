package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downSide;
    private double lateralSide;

    @Override
    public double getArea() {
        return ((this.downSide + this.topSide) / 2)
                * Math.sqrt((this.lateralSide * this.lateralSide)
                - (Math.pow(this.downSide - this.topSide, 2) / 4));
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        if (topSide > 0) {
            this.topSide = topSide;
        }
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        if (downSide > 0) {
            this.downSide = downSide;
        }
    }

    public double getLateralSide() {
        return lateralSide;
    }

    public void setLateralSide(double lateralSide) {
        if (lateralSide > 0) {
            this.lateralSide = lateralSide;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + this.getArea()
                + " sq. units, topSide: " + this.topSide + " units, downSide: "
                + this.downSide + " units, lateralSide: "
                + this.lateralSide + " units, color: " + this.getColor());

    }
}
