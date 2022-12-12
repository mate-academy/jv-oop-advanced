package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double AREA_COEFFICIENT = 0.5;
    private int altitude;
    private int base;

    public RightTriangle(String color, int base, int altitude) {
        super(color);
        this.altitude = altitude;
        this.base = base;
    }

    @Override
    public double getArea() {
        return AREA_COEFFICIENT * base * altitude;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle, "
                + "getArea: " + getArea() + " sq.units, "
                + "base: " + this.base + " units, "
                + "altitude: " + this.altitude + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
