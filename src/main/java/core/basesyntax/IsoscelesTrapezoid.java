package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double littleSide;
    private double bigSide;
    private double altitude;

    public IsoscelesTrapezoid(double littleSide, double bigSide, double altitude) {
        this.littleSide = littleSide;
        this.bigSide = bigSide;
        this.altitude = altitude;
    }

    public IsoscelesTrapezoid() {
        littleSide = random.nextDouble();
        bigSide = random.nextDouble();
        altitude = random.nextDouble();
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
