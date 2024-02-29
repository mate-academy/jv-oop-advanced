package core.basesyntax;

public class IsoscelesTrapezoid implements Figura {
    private final double lenthUp;
    private final double lenthDown;
    private final double lenthSide;
    private final String color;

    public IsoscelesTrapezoid(double lenthUp, double lenthDown, double lenthSide, String color) {
        this.lenthUp = lenthUp;
        this.lenthDown = lenthDown;
        this.lenthSide = lenthSide;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure : isosceles trapezoid, "
                + "area: " + getArea()
                + " sq. units, "
                + "lenthUp = " + this.lenthUp + " units"
                + ", lenthDown = " + this.lenthDown + " units"
                + ", lenthSide = " + this.lenthSide
                +  " units, color: '"
                + this.color + "'";
    }

    @Override
    public double getArea() {
        return ((lenthUp + lenthDown) / 4)
                * Math.sqrt((4 * lenthSide * lenthSide)
                        - ((lenthUp - lenthDown) * (lenthUp - lenthDown)));
    }
}
