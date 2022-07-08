package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private double downside;
    private double upside;
    private double hight;

    public double getDownside() {
        return downside;
    }

    public void setDownside(double downside) {
        this.downside = downside;
    }

    public double getUpside() {
        return upside;
    }

    public void setUpside(double upside) {
        this.upside = upside;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return (downside + upside) / 2 * hight;
    }
}
