package core.basesyntax;

public class RightTriangle extends Figure {
    private double altitude;

    public RightTriangle(String color, double parameter, double altitude) {
        super(color, parameter);
        this.altitude = altitude;
    }

    @Override
    public double getArea() {
        return getParameter() * altitude / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle " + getArea()
                + " sq.units, base: " + getParameter()
                + " units, altitude: " + altitude
                + " units, color: " + getColor());
    }
}
