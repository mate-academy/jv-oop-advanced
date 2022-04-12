package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double high;
    private double upSide;
    private double downSide;

    public IsoscelesTrapezoid(String color, double high, double upSide, double downSide) {
        super(color);
        this.high = high;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public double getUpSide() {
        return upSide;
    }

    public void setUpSide(int upSide) {
        this.upSide = upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(int downSide) {
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2 * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea() + ", high: "
                + getHigh() + ", upSide: " + getUpSide() + ", downSide: "
                + getDownSide() + ", color: " + getColor());
    }
}
