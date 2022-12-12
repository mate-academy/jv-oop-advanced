package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public double getUpSide() {
        return upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public double getHeight() {
        return height;
    }

    public void setUpSide(double longSide) {
        this.upSide = longSide;
    }

    public void setDownSide(double shortSide) {
        this.downSide = shortSide;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        if (upSide == 0 || downSide == 0) {
            return 0;
        }
        return height * 0.5 * (upSide + downSide);
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid, area " + getArea()
                + " sq.units, upSide " + getUpSide() + " units, upSide "
                + getDownSide() + " units, height: " + getHeight()
                + " units, color " + getColor();
    }

}
