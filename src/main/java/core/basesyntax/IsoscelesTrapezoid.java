package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double littleSide;
    private double bigSide;
    private double altitude;
    private String color;

    public IsoscelesTrapezoid(double littleSide, double bigSide, double altitude, String color) {
        this.littleSide = littleSide;
        this.bigSide = bigSide;
        this.altitude = altitude;
        this.color = color;
    }

    public IsoscelesTrapezoid() {
        littleSide = random.nextDouble();
        bigSide = random.nextDouble();
        altitude = random.nextDouble();
        color = getColor();
    }

    @Override
    public double getArea() {
        return (littleSide + bigSide) * 0.5 * altitude;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area + " sq.units, little side: "
                + littleSide + " units, big side: " + bigSide + " units, altitude: " + altitude
                + " units, color: " + color);
    }
}
