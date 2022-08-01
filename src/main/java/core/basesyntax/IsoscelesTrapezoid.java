package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downSide;
    private double side;

    public double getTopSide() {
        return topSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public double getSide() {
        return side;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, " + "TopSide: " + topSide + " units, "
                + "DownSide: " + downSide + " units, "
                + "Side: " + side + " units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return (topSide + downSide) / 2 * Math.sqrt(Math.pow(side, 2)
                - (Math.pow(Math.abs(topSide - downSide), 2) / 4));
    }
}
