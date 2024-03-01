package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lenthUp;
    private final double lenthDown;
    private final double hight;

    public IsoscelesTrapezoid(double lenthUp, double lenthDown, double hight, String color) {
        super(color);
        this.lenthUp = lenthUp;
        this.lenthDown = lenthDown;
        this.hight = hight;
    }


    @Override
    public double getArea() {
        return 0.5 * (lenthDown + lenthUp) * hight;
    }

    @Override
    public String toString() {
        return "Figure: rigttriagle, area: "
                + getArea() + " sq. units, lenthUp : "
                + lenthUp + "units," + "lenthDown : "
                + lenthDown + "units, " + "height: "
                + hight + "units, " + " color : "
                + getColor();
    }

}
