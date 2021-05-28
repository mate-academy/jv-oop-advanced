package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double topSide;
    private double downSide;

    public IsoscelesTrapezoid(double side, double topSide, double downSide, String color) {
        this.side = side;
        this.topSide = topSide;
        this.downSide = downSide;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "area=" + getArea() + " sq.units" +
                ", side=" + side + " units" +
                ", topSide=" + topSide + " units" +
                ", downSide=" + downSide + " units" +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return ((topSide + downSide) / 2) *
                Math.sqrt(side * side - ((downSide - topSide) * (downSide - topSide) / 4));
    }
}
