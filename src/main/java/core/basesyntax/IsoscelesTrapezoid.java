package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int weigth;
    private int basisless;
    private int basislarge;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int weigth, int basisless, int basislarge) {
        this.weigth = weigth;
        this.basisless = basisless;
        this.basislarge = basislarge;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getBasisless() {
        return basisless;
    }

    public void setBasisless(int basisless) {
        this.basisless = basisless;
    }

    public int getBasislarge() {
        return basislarge;
    }

    public void setBasislarge(int basislarge) {
        this.basislarge = basislarge;
    }

    @Override
    public double getArea() {
        return (double) (basislarge + basisless) * weigth / 2;
    }

    public void getInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, weigth: "
                + weigth + "  units, basisless " + basisless + "  units, basislarge "
                + basislarge + "  units, color: " + super.getColor());
    }

}
