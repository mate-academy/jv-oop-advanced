package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double altitude;

    public RightTriangle(String color, double base, double altitude) {
        super(color);
        this.base = base;
        this.altitude = altitude;
    }

    @Override
    public double getArea() {
        return base * altitude / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle " + getArea()
                + " sq.units, base: " + base
                + " units, altitude: " + altitude
                + " units, color: " + getColor());
    }
}
