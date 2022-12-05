package core.basesyntax;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int altitude;
    private int base;

    public RightTriangle(String color, int base, int altitude) {
        super(color);
        this.altitude = altitude;
        this.base = base;
        this.hypotenuse = (int)Math.sqrt(base * base + altitude * altitude);
    }

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
                + "color: " + getColor().toLowerCase());
    }
}
