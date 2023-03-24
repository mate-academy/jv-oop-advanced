package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double littleSide;
    private double bigSide;
    private double altitude;

    public IsoscelesTrapezoid(double a, double b, double c) {
        littleSide = a;
        bigSide = b;
        altitude = c;
    }

    @Override
    public double getArea() {
        area = (littleSide + bigSide) * 0.5 * altitude;
        return area;
    }

    @Override
    public String getData() {
        data = "Figure: isosceles trapezoid, area: " + area + " sq.units, little side: "
                + littleSide + " units, big side: " + bigSide + " units, altitude: " + altitude
                + " units, color: " + color;
        return data;
    }
}
