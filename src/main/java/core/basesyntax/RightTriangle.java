package core.basesyntax;

public class RightTriangle extends Figure {
    private double hypotenuse;
    private double base;
    private double altitude;

    @Override
    public double area() {
        return 0.5 * base * altitude;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle, "
                + "area: " + area() + " sq.units, "
                + "hypotenuse: " + this.hypotenuse + " units, "
                + "base: " + this.base + " units, "
                + "altitude: " + this.altitude + " units, "
                + "color: " + getColor());
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    private void calculateHypotenuse() {
        this.hypotenuse = Math.sqrt(base * base + altitude * altitude);
    }
}
