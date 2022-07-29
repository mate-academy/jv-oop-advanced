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

    @Override
    public double getArea() {
        return (double) (basislarge + basisless) * weigth / 2;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, weigth: "
                + weigth + "  units, basisless " + basisless + "  units, basislarge "
                + basislarge + "  units, color: " + super.getColor());
    }

}
