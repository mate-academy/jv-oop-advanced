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
        return (littleSide + bigSide) * 0.5 * altitude;
    }

    @Override
    public String getData() {
        return "Figure: isosceles trapezoid, area: " + area + " sq.units, little side: "
                + littleSide + " units, big side: " + bigSide + " units, altitude: " + altitude
                + " units, color: " + color;
    }
}
